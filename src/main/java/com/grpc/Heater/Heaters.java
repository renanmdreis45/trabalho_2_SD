package com.grpc.Heater;
import java.util.ArrayList;

import com.Heating.Heater;

public class Heaters extends ArrayList<Heater> {

    public static Heaters heaters;

    public static Heaters getInstance() {
        if (heaters == null) {
            heaters = new Heaters();
        }
        return heaters;
    }

    public Heaters() {
        this.add(com.Heating.Heater.newBuilder()
                .setDeviceId(1)
                .setLocation("Kitchen")
                .setStatus("ON")
                .setTemperature(1)
                .build());

    }



}


