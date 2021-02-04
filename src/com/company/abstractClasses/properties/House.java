package com.company.abstractClasses.properties;

public class House extends Property {
    private final Integer stories;
    private final Type houseType;
    public House(String location, Integer rooms, Integer value, Integer stories, Type houseType) {
        super(location, rooms, value);
        this.stories = stories;
        this.houseType = houseType;
    }

    Type getHouseType() {
        return houseType;
    }
}
