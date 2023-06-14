package com.iteratrlearning.design_patterns.answers.observer;

public class Alarm implements Device {
    @Override
    public void notify(int temperature) {
        if(temperature > 16) {
            System.out.println("Call the firemen!");
        }
    }
}
