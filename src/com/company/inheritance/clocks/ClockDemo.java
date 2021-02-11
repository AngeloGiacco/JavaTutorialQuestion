package com.company.inheritance.clocks;

import java.util.Set;

class clockThread implements Runnable {
    private final Thread t;
    private final Set<Clock> clockSet;
    clockThread(Set<Clock> clockSet) {
        this.clockSet = clockSet;
        this.t = new Thread(this, "Thread");
        this.t.start();
    }
    public void run() {
        try {
            while (true) {
                Thread.sleep(1);
                clockSet.forEach(Clock::tick);
                clockSet.forEach(item -> System.out.println(item.toString()));
            }
        } catch (InterruptedException e) {
            System.out.println("The child thread is interrupted.");
        }
    }
}

public class ClockDemo {

    public static void main(String[] args) {
        Clock clock1 = new Clock(10,10,10);
        Clock clock2 = new Clock(0);
        Clock clock3 = new Clock(23,10,10);
        new clockThread(Set.of(clock1,clock2,clock3));
    }

}
