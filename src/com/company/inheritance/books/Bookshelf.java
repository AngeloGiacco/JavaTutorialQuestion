package com.company.inheritance.books;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Bookshelf{

    private final List<Book> bookshelf;

    public Bookshelf(){
        bookshelf = new LinkedList<Book>();
    }

    public int size() {
        return this.bookshelf.size();
    }

    public void addBookOnLeftSide(Book b){
        ((LinkedList) bookshelf).addFirst(b);
    }

    public void addBookOnRightSide(Book b){
        ((LinkedList) bookshelf).addLast(b);
    }

    public void addBook(int i, Book b){
        try {
            bookshelf.add(i, b);
        } catch (IndexOutOfBoundsException e){
            this.addBookOnRightSide(b);
        }
    }

    public Book remove(int i){
        return bookshelf.remove(i);
    }

    public void printLeftToRight(){
        bookshelf.forEach(System.out::println);
    }

    public void printRightToLefts() {
        Collections.reverse(bookshelf);
        printLeftToRight();
        Collections.reverse(bookshelf);
    }

    public List<Book> getBookshelf() {
        return this.bookshelf;
    }


}
