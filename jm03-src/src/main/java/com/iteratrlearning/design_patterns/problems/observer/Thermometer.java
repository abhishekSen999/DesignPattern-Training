package com.iteratrlearning.design_patterns.problems.observer;

public class Thermometer {

    private Alarm alarm;
    private Display display;
    private int[] data = {15, 14, 16, 13, 17, 19, 18};
    private int index = 0;
    private int temperature = 0;

    public void poll() {
        if(index >= data.length) {
            index = 0;
        }

        this.temperature = data[index];
        index++;
        alarm.checkTemperature();
        display.display();

    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

}
