package com.company.abstractClasses.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            for (int j = 1; j <= i; j++){
                shapeList.add(new Ellipse(i,j));
                shapeList.add(new Rectangle(i,j));
            }
        }
        List<Shape> circles = shapeList.stream()
                .filter(item -> item.isCircle())
                .collect(Collectors.toList());
        List<Shape> squares = shapeList.stream()
                .filter(item -> item.isSquare())
                .collect(Collectors.toList());
        assert squares.size() == 9;
        assert circles.size() == 9;
        shapeList.get(1).setHeight(2);
        shapeList.get(2).setWidth(2);
        circles = shapeList.stream()
                .filter(item -> item.isCircle())
                .collect(Collectors.toList());
        squares = shapeList.stream()
                .filter(item -> item.isSquare())
                .collect(Collectors.toList());
        assert squares.size() == 8;
        assert circles.size() == 10;
    }
}
