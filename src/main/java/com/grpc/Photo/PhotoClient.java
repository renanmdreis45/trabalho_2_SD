package com.grpc.Photo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.Photo.LoadPhotoRequest;
import com.Photo.PhotoServiceGrpc;
import com.Photo.PhotoViewResponse;
import com.google.protobuf.ByteString;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class PhotoClient {

	JFrame frame;
    JTextArea message_text_area = new JTextArea();
    ManagedChannel  channel = null;
    PhotoServiceGrpc.PhotoServiceStub asynchClient = null;
    JLabel image_label = new JLabel();
    ImageIcon photo_icon = null;
    String default_file = "C:/Users/darre/Desktop/4th year/lion.jpg";

    public PhotoClient() {
        run_client();
    }

    public static void main(String[] args) {
        PhotoClient photoClient = new PhotoClient();
    }

    private void run_client() {

        frame =new JFrame("Photo Display Controller");//creating instance of JFrame
        JPanel panel = new JPanel();

        try {

            photo_icon = new ImageIcon(default_file);

            if (photo_icon == null) {
                System.out.println("Unable to retrieve default image from " + default_file);
            }

        } catch (Exception e) {
            System.out.println("Unable to retrieve default image from " + default_file);
        }

        image_label.setIcon(photo_icon);

        JButton loaddefaultPhotoButton = new JButton("Upload Photo to Server ");//creating instance of JButton
        panel.add(loaddefaultPhotoButton);//adding button in JFrame
        loaddefaultPhotoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                loadThePhoto();
            }
       });

        panel.add(image_label);

        frame.add(panel);
        frame.setSize(750,350);
        //frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible


    }

    private void loadThePhoto() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
                .usePlaintext()
                .build();

        // create the stub
        asynchClient =  PhotoServiceGrpc.newStub(channel);


        try {
            StreamObserver<LoadPhotoRequest> stream
                    = asynchClient.viewPhoto(
                    new StreamObserver<PhotoViewResponse>() {
                        @Override
                        public void onNext(PhotoViewResponse response) {
                            System.out.println(response.getFinishedUpload());
                        }

                        @Override
                        public void onError(Throwable thrwbl) {
                            System.out.println(thrwbl);
                        }

                        @Override
                        public void onCompleted() {
                            System.out.println("Finished loading photo");
                            // no-op
                        }

                    });







            FileInputStream fs = new FileInputStream(default_file);
            while (true) {
                // break into chunks of 1024 bytes
                byte[] data = new byte[1 * 1024];

                int bytesRead = fs.read(data);
                if (bytesRead == -1) {
                    break;
                }

                if (bytesRead < data.length) {
                    byte[] newData = new byte[bytesRead];
                    System.arraycopy(data, 0, newData, 0, bytesRead);
                    data = newData;
                }

                System.out.println("Bytes read = "+ bytesRead);

                LoadPhotoRequest request = LoadPhotoRequest.newBuilder()
                        .setPhoto(ByteString.copyFrom(data)).build();
                stream.onNext(request);
            }

            stream.onCompleted();
        } catch (Exception e) {
            System.out.println(e);
        }

        // shutting down channel
        System.out.println("Shutting down Photo Client");
        channel.shutdown();


    }
}
