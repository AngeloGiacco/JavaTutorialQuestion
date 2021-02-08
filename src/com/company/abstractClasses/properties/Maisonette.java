package com.company.abstractClasses.properties;

public class Maisonette extends Flat{
    private final Integer floors;
    public Maisonette(String location, Integer value, Integer rooms, Integer floor, Integer floors){
        super(location, value, rooms, floor);
        this.floors = floors;
    }
}
