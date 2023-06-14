package com.iteratrlearning.design_patterns.examples.adapter;

public class DeviceResourceApp {

    public static void main(String[] args) {

        Device device = new Device();
        //2.
//        Resource resource = new AdapterDeviceResource(device);

        // We need to use an legacy API expecting Resource
        // 1.
//        LegacyAPI.process(device);
    }

}
