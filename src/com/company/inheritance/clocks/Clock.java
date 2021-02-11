package com.company.inheritance.clocks;

import java.sql.SQLOutput;

public class Clock {
    private Integer seconds;
    private final boolean secondMode;

    public Clock(Integer seconds){
        this.seconds = seconds;
        this.secondMode = true;
    }

    public Clock(Integer hours, Integer minutes, Integer seconds){
        this.seconds = hours * 3600 + minutes * 60 + seconds;
        this.secondMode = false;
    }

    public void tick() {
        seconds++;
    }

    @Override
    public String toString() {
        if (secondMode){
            return seconds+" seconds since midnight!";
        } else {
            Integer hours = seconds / 3600;
            Integer secs = seconds - hours * 3600;
            Integer minutes = secs / 60;
            secs -= minutes * 60;
            return hours+":"+minutes+":"+secs;
        }
    }

}
