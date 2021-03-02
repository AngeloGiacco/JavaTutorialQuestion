package com.company.abstractClasses.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }

    @Override
    public boolean isCircle() {
        return false;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
