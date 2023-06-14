package com.iteratrlearning.design_patterns.answers.observer;

import java.util.ArrayList;
import java.util.List;

public class Thermometer {

    private List<Device> deviceList = new ArrayList<>();
    private int[] data = {15, 14, 16, 13, 17, 19, 18};
    private int index = 0;
    private int temperature = 0;

    public void poll() {
        if(index >= data.length) {
            index = 0;
        }

        this.temperature = data[index];
        index++;
        updateAll();
    }

    public void connectDevice(Device device) {
        this.deviceList.add(device);
    }

    public void updateAll() {
         this.deviceList.forEach(device -> device.notify(temperature));
    }

}
