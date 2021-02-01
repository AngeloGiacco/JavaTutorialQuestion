package com.company.abstractClasses.properties;

public class Flat extends Property{
    private Integer nthFloor;
    public Flat(String location, Integer value, Integer rooms, Integer floor){
        super(location,value,rooms);
        this.nthFloor = floor;
    }
}
