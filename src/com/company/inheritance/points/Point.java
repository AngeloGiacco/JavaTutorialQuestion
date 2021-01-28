package com.company.inheritance.points;

public class Point {
    private final int x;
    private final int y;
    private final int z;

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private static Point origin(){
        return new Point(0,0,0);
    }

    public Double euclideanDistance(Point other){
        int dx = this.x - other.getX();
        int dy = this.y - other.getY();
        int dz = this.z - other.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double distanceFromOrigin(){
        return this.euclideanDistance(origin());
    }

    @Override
    public String toString() {
        return "This point is located at x: " + this.x + "; y: " + this.y + "; z: " + this.z + ".";
    }

    public static void main(String[] args) {
        Point cp1 = new Point(3,4,12);
        assert cp1.distanceFromOrigin() == 13;
    }
    @Override
    public boolean equals(Object that) {

        if (!(that instanceof Point)) {
            return false;
        }
        Point thatPoint = (Point) that;
        return x == thatPoint.getX() && y == thatPoint.getY() && z == thatPoint.getZ();

    }
}
