package com.company.abstractClasses.properties;

abstract class Property {
    Integer value;
    Integer rooms;
    final String location;

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
}
