package com.company.musicCollection;

public class Record {
    private final String name;
    private final Genre genre;

    public Record(String name, String genre){
        this.name = name;
        if (genre == "jazz") {
            this.genre = Genre.JAZZ;
        } else if (genre == "pop") {
            this.genre = Genre.POP;
        } else if (genre == "rock"){
            this.genre = Genre.ROCK;
        } else {
            throw new IllegalArgumentException("invalid genre");
        }
    }

    public Record(String name, Genre genre){
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre(){
        return genre;
    }
}
