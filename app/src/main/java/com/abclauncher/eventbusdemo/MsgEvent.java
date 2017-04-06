package com.abclauncher.eventbusdemo;

/**
 * Created by sks on 2017/4/6.
 */

public class MsgEvent {
    private int hours, minutes;
    public MsgEvent(int hours, int minutes){
            this.hours = hours;
            this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
