package com.company.abstractClasses.properties;

abstract class Property {
    protected final String location;
    protected Integer value;
    protected Integer rooms;
    protected Integer bedrooms = 0;
    protected Integer receptionRooms = 0;
    protected double squareFootage = 0;

    public Property(String location, Integer value, Integer rooms) {
        this.location = location;
        this.value = value;
        this.rooms = rooms;
    }

    public void increaseValue(Integer increase) {
        this.value += increase;
    }

    public void decreaseValue(Integer decrease) {
        this.increaseValue(-decrease);
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setReceptionRooms(int receptionRooms) {
        this.receptionRooms = receptionRooms;
    }
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

}
