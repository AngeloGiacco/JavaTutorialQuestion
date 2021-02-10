package com.company.abstractClasses.properties;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.company.abstractClasses.properties.Type.TERRACED;

public class PropertyCollection {
    private final Set<Property> portfolio;

    public PropertyCollection(){
        this.portfolio = new HashSet<Property>();
    }
    // Add a property to the collection
    public void addProperty(Property p){
        this.portfolio.add(p);
    }

    // Return the set of all houses in the collection
    public Set<House> getHouses() {
        return this.portfolio.stream().
                filter(item -> item instanceof House)
                .map(item -> (House) item)
                .collect(Collectors.toSet());
    }

    // Return the set of all bungalows in the collection
    public Set<Bungalow> getBungalows() {
        return this.portfolio.stream().
                filter(item -> item instanceof Bungalow)
                .map(item -> (Bungalow) item)
                .collect(Collectors.toSet());
    }

    // Return the set of all flats in the collection
    public Set<Flat> getFlats() {
        return this.portfolio.stream().
                filter(item -> item instanceof Flat)
                .map(item -> (Flat) item)
                .collect(Collectors.toSet());
    }

    // Return the set of all maisonettes in the collection
    public Set<Maisonette> getMaisonettes(){
        return this.portfolio.stream().
                filter(item -> item instanceof Maisonette)
                .map(item -> (Maisonette) item)
                .collect(Collectors.toSet());
    }

    // Return the set of all terraced houses in the collection
    public Set<House> getTerracedHouses(){
        return this.getHouses()
                .stream()
                .filter(item -> item.getHouseType() == TERRACED)
                .collect(Collectors.toSet());
    }
}
