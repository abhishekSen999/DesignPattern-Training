package com.iteratrlearning.design_patterns.answers.observer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class House {

    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        Alarm alarm = new Alarm();
        Display display = new Display();

        thermometer.connectDevice(alarm);
        thermometer.connectDevice(display);

        ScheduledExecutorService scheduledThreadPoolExecutor
                = Executors.newScheduledThreadPool(1);

        scheduledThreadPoolExecutor.scheduleAtFixedRate(thermometer::poll, 0, 1, TimeUnit.SECONDS);
    }
}
