package com.company.inheritance.points;

public class ColouredPoint extends Point {
    private final Colour colour;

    public ColouredPoint(int x, int y, int z, int red, int green, int blue) {
        super(x, y, z);
        this.colour = new Colour(red,green,blue);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nThe red colour component is: " + this.colour.getRed() +"."+
                "\nThe green colour component is: " + this.colour.getGreen() +"."+
                "\nThe blue colour component is: " + this.colour.getBlue()+".";
    }

    public static void main(String[] args) {
        ColouredPoint cp1 = new ColouredPoint(5,5,1,255,255,255);
        ColouredPoint cp2 = new ColouredPoint(5,1,4,10,10,10);
        System.out.println(cp1.toString());
        assert cp1.toString().equals("This point is located at x: 5; y: 5; z: 1.\nThe red colour component is: 255.\n" +
                "The green colour component is: 255.\nThe blue colour component is: 255.");
        assert cp1.euclideanDistance(cp2) == 5;
    }
}
