package com.grpc.Fan;


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.logging.Logger;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;

	import com.Fan.*;
import com.Fan.FanServiceGrpc.FanServiceBlockingStub;
import com.Fan.FanServiceGrpc.FanServiceFutureStub;
import com.Fan.FanServiceGrpc.FanServiceStub;
import com.grpc.Fan.FanClient;

	public class FanClient {
		private static  Logger logger = Logger.getLogger(FanClient.class.getName());

		private static FanServiceGrpc.FanServiceBlockingStub blockingStub;
		private static FanServiceGrpc.FanServiceStub asyncStub;
		private static FanServiceGrpc.FanServiceFutureStub futureStub;
		
		    JFrame frame;
		    JTextArea message_text_area = new JTextArea();
		    JTextField temp_value;
		    ManagedChannel channel = null;
		    
		public static void main(String[] args) throws Exception {
			FanClient fanClient = new FanClient();
		
		}
		
		public FanClient() {
			run();
		}
		
		private void run() {
			// TODO Auto-generated method stub
			//creating instances for jframe
			frame = new JFrame("Fan Remote");
			JPanel panel = new JPanel();
			JLabel label = new JLabel("Set Speed");
			
			temp_value = new JTextField(1);
			temp_value.setText("1");
			
			panel.add(label);
			panel.add(temp_value);
			
			//creating instance of jbutton
			JButton speedButton = new JButton("Set speed");
			panel.add(speedButton);//adding the speed button to the jframe
			speedButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					SetSpeed();
				}
			});
			//creating fan information button using jbutton
			JButton showInfoButton = new JButton("Show Fan Info");
			panel.add(showInfoButton);//adding button to the jframe
			showInfoButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					ShowDeviceStatus();
				}
				
			});
			
			JButton offButton = new JButton("Turn off Button");
			panel.add(offButton);//adding button to the jframe
			offButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					TurnOffFan();
				}
				
			});
			
			message_text_area = new JTextArea(20,50);
			panel.add(message_text_area);
			message_text_area.setText("Fan Cient is running.");
			
			frame.add(panel);
			frame.setSize(500,500);
			frame.setVisible(true);
			
		}

		
		
		

		private void SetSpeed() {
			// TODO Auto-generated method stub
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			//creating stub
			blockingStub = FanServiceGrpc.newBlockingStub(channel);
			//set string to JTextfield value
			String temp = temp_value.getText();
			int temp_s = 0;
			//set temp_t to string temp value
			try {
				temp_s = Integer.parseInt(temp);
			}catch(Exception e){
				temp_s = 0;
			}
			
			if(temp_s >= 1 && temp_s <= 3) {
				GetSpeedRequest current_fan = GetSpeedRequest.newBuilder().setDeviceId(1).setSpeed(temp_s).build();
				FanInfoResponse server_response = blockingStub.setSpeed(current_fan);
				
				String result = server_response.getFaninfo().toString();
				message_text_area.setText(result);
				
				System.out.println(result);
			}
			else {
				message_text_area.setText("You must choose a settings from level 1 to level 3");
			}
			
			System.out.println("Shutting down the Fan Client");
			channel.shutdown();
			
			
		}

		private void TurnOffFan() {
			// TODO Auto-generated method stub
ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			//creating stub
			blockingStub = FanServiceGrpc.newBlockingStub(channel);
			//get fan by id 
			GetDeviceByIdRequest current_fan = GetDeviceByIdRequest.newBuilder().setDeviceId(1).build();
			FanInfoResponse server_response = blockingStub.turnOffFan(current_fan);
			
			String result = server_response.getFaninfo().toString();
			message_text_area.setText(result);
			
			System.out.println(result);
			
			System.out.println("Shutting down Fan Client");
			channel.shutdown();
			
		}

		private void ShowDeviceStatus() {
			// TODO Auto-generated method stub
ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			//creating stub
			blockingStub = FanServiceGrpc.newBlockingStub(channel);
			
			GetDeviceByIdRequest current_fan = GetDeviceByIdRequest.newBuilder().setDeviceId(1).build();
			FanInfoResponse server_response = blockingStub.showDeviceStatus(current_fan);
			
			//set text area to fan information
			message_text_area.setText("Current Information : ");
			String result = server_response.getFaninfo().toString();
			message_text_area.append(result);
			
			System.out.println(result);
			
			System.out.println("Shutting down Fan Client");
			channel.shutdown();
			
		}

	}


