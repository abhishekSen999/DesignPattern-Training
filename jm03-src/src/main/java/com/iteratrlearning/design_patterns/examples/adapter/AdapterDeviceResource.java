package com.iteratrlearning.design_patterns.examples.adapter;

public class AdapterDeviceResource implements Resource {

    private Device device;

    public AdapterDeviceResource(Device device) {
        this.device = device;
    }

    @Override
    public int read() {
        return this.device.poll();
    }
}
