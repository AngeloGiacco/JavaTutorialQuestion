package com.company.abstractClasses.shapes;

public class Ellipse extends Shape {
    private double radiusWidth;
    private double radiusHeight;

    public Ellipse(double radiusHeight, double radiusWidth){
        this.radiusHeight = radiusHeight;
        this.radiusWidth = radiusWidth;
    }

    @Override
    public double area() {
        return Math.PI * radiusHeight * radiusWidth;
    }

    @Override
    public boolean isSquare() {
        return false;
    }

    @Override
    public boolean isCircle() {
        return radiusHeight == radiusWidth;
    }

    @Override
    void setWidth(double width) {
        this.radiusWidth = width;
    }

    @Override
    void setHeight(double height) {
        this.radiusHeight = height;
    }
}
