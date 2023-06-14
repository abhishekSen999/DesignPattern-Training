package com.iteratrlearning.design_patterns.problems.observer;

public class Display {

    private Thermometer thermometer;

    public Display(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    public void display() {
        int temperature = thermometer.getTemperature();
        System.out.println("The temperature is " + temperature);
    }
}
