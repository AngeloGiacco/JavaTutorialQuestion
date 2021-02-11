package com.company.inheritance.points;

public class Colour {
    private final int r;
    private final int g;
    private final int b;

    public Colour(int red, int green, int blue){
        this.r = red;
        this.g = green;
        this.b = blue;
    }


    public int getRed() {
        return r;
    }

    public int getGreen() {
        return g;
    }

    public int getBlue() {
        return b;
    }
}
