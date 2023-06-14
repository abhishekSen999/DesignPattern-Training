package com.iteratrlearning.design_patterns.problems.observer;

public class Alarm {

    private Thermometer thermometer;

    public Alarm(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    public void checkTemperature() {
        int temperature = thermometer.getTemperature();

        if(temperature > 16) {
            System.out.println("Call the firemen!");
        }
    }
}
