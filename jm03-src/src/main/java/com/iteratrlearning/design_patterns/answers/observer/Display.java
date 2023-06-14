package com.iteratrlearning.design_patterns.answers.observer;

public class Display implements Device {
    @Override
    public void notify(int temperature) {
        System.out.println("The temperature is " + temperature);
    }
}
