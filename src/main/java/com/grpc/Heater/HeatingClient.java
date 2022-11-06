package com.grpc.Heater;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.Fan.FanInfoResponse;
import com.Fan.FanServiceGrpc;
import com.Fan.GetDeviceByIdRequest;
import com.Heating.HeaterInfoResponse;
import com.Heating.HeaterStatusRequest;
import com.Heating.HeaterToUpdateRequest;
import com.Heating.HeatingServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class HeatingClient {
	
	private static HeatingServiceGrpc.HeatingServiceBlockingStub blockingStub;
	JFrame frame;
    JTextArea message_text_area = new JTextArea();
    JTextField temp_value;
    ManagedChannel channel = null;
    HeatingServiceGrpc.HeatingServiceStub asyncstub = null;

    
    public static void main(String[] args) throws Exception {
    	HeatingClient heatingClient = new HeatingClient();
    	
    }
    
    public HeatingClient() {
    	run();
    }

	private void run() {
		// TODO Auto-generated method stub
		frame = new JFrame("Heater Remote");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Set Temperature");
		
		temp_value = new JTextField(1);
		temp_value.setText("1");
		
		panel.add(label);
		panel.add(temp_value);
		//creating instance of jbutton
		JButton tempButton = new JButton("Set temperature");
		panel.add(tempButton);//adding the speed button to the jframe
		tempButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SetTemp();
			}
		});
		//creating fan information button using jbutton
		JButton showInfoButton = new JButton("Show Heater Information");
		panel.add(showInfoButton);//adding button to the jframe
		showInfoButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ShowStatus();
			}
			
		});
		//creating instanse of jbutton
		JButton offButton = new JButton("Turn off Button");
		panel.add(offButton);//adding button to the jframe
		offButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TurnOff();
			}
			
		});
		
		message_text_area = new JTextArea(20,50);
		panel.add(message_text_area);
		message_text_area.setText("Fan Cient is running.");
		
		frame.add(panel);
		frame.setSize(750,350);
		frame.setVisible(true);
		
	
	}

	protected void TurnOff() {
		// TODO Auto-generated method stub
		channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		//creating stub
		blockingStub = HeatingServiceGrpc.newBlockingStub(channel);
		
		HeaterToUpdateRequest heater = HeaterToUpdateRequest.newBuilder().setDeviceId(1).build();
        HeaterInfoResponse server_response = blockingStub.turnOff(heater);
		
		String result = server_response.getHeater().toString();
		message_text_area.setText(result);
		
		System.out.println(result);
		
		System.out.println("Shutting down Fan Client");
		channel.shutdown();
		
	}

	private void ShowStatus() {
		// TODO Auto-generated method stub
		channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		//create stub
		blockingStub = HeatingServiceGrpc.newBlockingStub(channel);
		
		HeaterStatusRequest heater = HeaterStatusRequest.newBuilder().setDeviceId(1).build();
        HeaterInfoResponse server_response = blockingStub.showStatus(heater);
        
        String result = server_response.getHeater().toString();
        message_text_area.setText(result);

        System.out.println(result);

        System.out.println("Shutting down Heating Client");
        channel.shutdown();
	}

	private void SetTemp() {
		// TODO Auto-generated method stub
		channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		//create stub
		blockingStub = HeatingServiceGrpc.newBlockingStub(channel);
		
		
		String temp = temp_value.getText();
		int deg = 0;
		
		try {
			deg = Integer.parseInt(temp);
		}catch (Exception e) {
			deg = 0;
		}
		//if degress from input is between 0-100 set the temp
		if(deg >=0 && deg < 100) {
			HeaterToUpdateRequest heater = HeaterToUpdateRequest.newBuilder().setDeviceId(1).setTemp(deg).build();
	        HeaterInfoResponse server_response = blockingStub.setTemp(heater);
	        
	        String result = server_response.getHeater().toString();
	        message_text_area.setText(result);
			
			System.out.println(result);
	        
		}
		else { //if not in range give message
            message_text_area.setText("You must enter a valid temperature setting between 0 and 100 degrees");
        }
		
		System.out.println("Shutting down Fan Client");
		channel.shutdown();
	}
    
    
}
