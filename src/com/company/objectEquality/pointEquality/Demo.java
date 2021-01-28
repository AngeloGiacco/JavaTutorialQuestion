package com.company.objectEquality.pointEquality;

import com.company.inheritance.points.Point;
import com.company.inheritance.points.ColouredPoint;
import com.company.inheritance.points.Colour;


public class Demo {

    public static void main(String[] args) {
        ColouredPoint cp = new ColouredPoint(1,2,3, 255,0,0);
        Point p = new Point(1,2,3);
        ColouredPoint cq = new ColouredPoint(1,2,3,0,255,0);
        System.out.println(cp.equals(cq));
        System.out.println(p.equals(cq));
        System.out.println(cq.equals(p));
    }

}
