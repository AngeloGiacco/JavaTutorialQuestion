package com.company.musicCollection;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private final String name;
    private final List<Record> catalogue = new ArrayList<>();
    private final Genre maingenre;

    public Artist(String name, String genre) {
        genre = genre.toLowerCase();
        if (genre == "jazz") {
            this.maingenre = Genre.JAZZ;
        } else if (genre == "pop") {
            this.maingenre = Genre.POP;
        } else if (genre == "rock"){
            this.maingenre = Genre.ROCK;
        } else {
            throw new IllegalArgumentException("invalid genre");
        }
        this.name = name;
    }

    public Artist(String name, Genre genre){
        this.name = name;
        this.maingenre = genre;
    }


    public String getName() {
        return name;
    }

    public List<Record> getCatalogue() {
        return catalogue;
    }

    public Genre getMaingenre() {
        return maingenre;
    }

    public void showCatalogue(){
        for (Record r : this.catalogue){
            System.out.println(this.getName()+" has produced "+r.getName()+" in the genre "+r.getGenre().toString());
        }
    }

    public void addRecord(String name){
        catalogue.add(new Record(name,this.getMaingenre()));
    }

    public void addRecord(String name, Genre genre){
        catalogue.add(new Record(name,genre));
    }

    public void showGenre(Genre genre){
        for (Record r : this.catalogue){
            if (r.getGenre() == genre) {
                System.out.println(this.getName() + " has produced " + r.getName() + " in the genre " + r.getGenre().toString());
            }
        }
    }
}
