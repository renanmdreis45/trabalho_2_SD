package com.grpc.Fan;

import java.util.ArrayList;

import com.Fan.FanInfoResponse;
import com.Fan.FanServiceGrpc;
import com.Fan.FanServiceGrpc.FanServiceImplBase;
import com.Fan.GetDeviceByIdRequest;
import com.Fan.GetSpeedRequest;

import io.grpc.stub.StreamObserver;
import static com.grpc.Fan.FanInfo.faninfo;;

public class FanService extends FanServiceImplBase{

	@Override
	public void showDeviceStatus(GetDeviceByIdRequest request, StreamObserver<FanInfoResponse> responseObserver) {
		//loop through all fans
		for(com.Fan.FanInfo fi: FanInfo.getInstance()) {
			
			//if the request device_id matches the one in memory
			if(fi.getDeviceId() == request.getDeviceId()) {
				FanInfoResponse response = FanInfoResponse.newBuilder().setFaninfo(fi).build();
				
				//this is the next response to send
				responseObserver.onNext(response);
				//send the message to let server know we are finished sending
				responseObserver.onCompleted();
				return;
			}
		}
	}

	@Override
	public void setSpeed(GetSpeedRequest request, StreamObserver<FanInfoResponse> responseObserver) {
		ArrayList<com.Fan.FanInfo> temp_list = FanInfo.getInstance();
		int new_speed = request.getSpeed();
		
		for(int i=0; i < temp_list.size(); i++) {
			com.Fan.FanInfo fan = (com.Fan.FanInfo) temp_list.get(i);
			faninfo.clear();
			
			faninfo.add(com.Fan.FanInfo.newBuilder()
					.setDeviceId(fan.getDeviceId())
					.setLocation(fan.getLocation())
					.setSpeed(new_speed)
					.build());
		}
		
		//need to loop through all fans in array
		for(com.Fan.FanInfo fan : faninfo) {
			FanInfoResponse response = FanInfoResponse.newBuilder().setFaninfo(fan).build();
			
			//this is the next response to send
			responseObserver.onNext(response);
			//send the message to let server know we are finished sending
			responseObserver.onCompleted();
			return;
		}
	}

	@Override
	public void turnOffFan(GetDeviceByIdRequest request, StreamObserver<FanInfoResponse> responseObserver) {
		
		ArrayList<com.Fan.FanInfo> temp_list = FanInfo.getInstance();
		int off_speed = 0;
		
		for(int i=0; i < temp_list.size(); i++) {
			com.Fan.FanInfo fan = (com.Fan.FanInfo) temp_list.get(i);
			faninfo.clear();
			
			faninfo.add(com.Fan.FanInfo.newBuilder()
					.setDeviceId(fan.getDeviceId())
					.setLocation(fan.getLocation())
					.setSpeed(off_speed)//setting speed to 0 
					.build());
		}
		
		//need to loop through all fans in array
		for(com.Fan.FanInfo fan : faninfo) {
			FanInfoResponse response = FanInfoResponse.newBuilder().setFaninfo(fan).build();
			
			//this is the next response to send
			responseObserver.onNext(response);
			//send the message to let server know we are finished sending
			responseObserver.onCompleted();
			return;
		}
	}
	

}
