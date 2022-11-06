package com.grpc.Heater;

import static com.grpc.Fan.FanInfo.faninfo;

import java.util.ArrayList;

import com.Fan.FanInfoResponse;
import com.Heating.Heater;
import com.Heating.HeaterInfoResponse;
import com.Heating.HeaterStatusRequest;
import com.Heating.HeaterToUpdateRequest;
import com.Heating.HeatingServiceGrpc.HeatingServiceImplBase;
import com.grpc.Fan.FanInfo;

import io.grpc.stub.StreamObserver;

public class HeatingService extends HeatingServiceImplBase{
	
	@Override
	public void showStatus(HeaterStatusRequest request, StreamObserver<HeaterInfoResponse> responseObserver) {
		// loop through all of the heaters
        for(com.Heating.Heater heater : Heaters.getInstance()) {

            // if the request device_id matches the one in memory
            if(heater.getDeviceId() == request.getDeviceId()) {

                HeaterInfoResponse response = HeaterInfoResponse.newBuilder().setHeater(heater).build();

                // this is the next response to send
                responseObserver.onNext(response);
                // let the server know we are finished sending
                responseObserver.onCompleted();
                return;
            }
        }
	}

	@Override
	public void setTemp(HeaterToUpdateRequest request, StreamObserver<HeaterInfoResponse> responseObserver) {
		ArrayList<com.Heating.Heater> temp_list = Heaters.getInstance();
		int set_temp = request.getTemp();
		
		for(int i=0; i < temp_list.size(); i++) {
			com.Heating.Heater heater = (com.Heating.Heater) temp_list.get(i);
			Heaters.heaters.clear();
			
			Heaters.heaters.add(com.Heating.Heater.newBuilder()
					.setDeviceId(heater.getDeviceId())
					.setLocation(heater.getLocation())
					.setStatus("On")//turning on the heater 
					.setTemperature(set_temp)//set temperature
					.build());
		}
		
		//need to loop through all fans in array
		for(com.Heating.Heater heater : Heaters.heaters) {
			HeaterInfoResponse response = HeaterInfoResponse.newBuilder().setHeater(heater).build();
			
			//this is the next response to send
			responseObserver.onNext(response);
			//send the message to let server know we are finished sending
			responseObserver.onCompleted();
			return;
		}
	}

	@Override
	public void turnOff(HeaterToUpdateRequest request, StreamObserver<HeaterInfoResponse> responseObserver) {
		ArrayList<com.Heating.Heater> temp_list = Heaters.getInstance();
		
		for(int i=0; i < temp_list.size(); i++) {
			com.Heating.Heater heater = (com.Heating.Heater) temp_list.get(i);
			Heaters.heaters.clear();
			
			Heaters.heaters.add(com.Heating.Heater.newBuilder()
					.setDeviceId(heater.getDeviceId())
					.setLocation(heater.getLocation())
					.setStatus("OFF")//turning off the heater 
					.setTemperature(0)
					.build());
		}
		
		//need to loop through all fans in array
		for(com.Heating.Heater heater : Heaters.heaters) {
			HeaterInfoResponse response = HeaterInfoResponse.newBuilder().setHeater(heater).build();
			
			//this is the next response to send
			responseObserver.onNext(response);
			//send the message to let server know we are finished sending
			responseObserver.onCompleted();
			return;
		}
	}
	

}
