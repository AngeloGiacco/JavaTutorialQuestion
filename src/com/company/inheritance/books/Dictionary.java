package com.company.inheritance.books;

public class Dictionary extends Book {

    private final String sourceLanguage;
    private final String targetLanguage;
    private int numDefintions;

    public Dictionary(String isbn, String title, int pages, String sourceLanguage, String targetLanguage, int numDefintions) {
        super(isbn, title, pages);
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.numDefintions = numDefintions;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" has "+numDefintions+" translations from " + sourceLanguage +" to "+targetLanguage+".");
        return sb.toString();
    }
}
