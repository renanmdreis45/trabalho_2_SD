package com.grpc.Photo;

import java.util.ArrayList;

public class Photo  extends ArrayList<com.Photo.Photo_Info> {

	    public static Photo photo;

	    public static Photo getInstance() {
	        if (photo == null) {
	            photo = new Photo();
	        }
	        return photo;
	    }

	    public Photo() {
	        this.add(com.Photo.Photo_Info.newBuilder()
	                .setDeviceId(1)
	                .setPhotoId(100)
	                .build());

	    }

	}
