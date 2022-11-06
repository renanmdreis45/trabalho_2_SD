package com.grpc.Fan;

import java.util.ArrayList;

public class FanInfo extends ArrayList<com.Fan.FanInfo>{
	public static FanInfo faninfo;
	
	public static FanInfo getInstance() {
		if (faninfo == null ) {
			faninfo = new FanInfo();
		}
		return faninfo;
	}
	
	public FanInfo() {
		this.add(com.Fan.FanInfo.newBuilder()
				.setDeviceId(1)
				.setLocation("Bedroom")
				.setSpeed(1)
				.build());
	}

}
