package com.company.inheritance.books;

public class Demo {

    public static void reorder(Bookshelf bookshelf) {
        Integer counter = 0;
        Integer index = 0;
        while (counter < bookshelf.size()) {
            if (bookshelf.getBookshelf().get(index) instanceof Dictionary){
                Book removed = bookshelf.remove(index);
                bookshelf.addBookOnRightSide(removed);
            } else {
                index++;
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        Book a = new Book("382700","My Book",80);
        Book b = new Book("18234908","Good book",60);
        Book c = new Book("0","Bible",1000);
        Book d = new Book("0000","Harry Potter",3000);
        Dictionary e = new Dictionary("234","Russian - English Dictionary",
                300, "Russian","English",10000);
        Dictionary f = new Dictionary("23452","Chinese - English Dictionary",
                300, "Chinese","English",10000);

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(1,e);
        bookshelf.addBook(2,c);
        bookshelf.addBook(3,a);
        bookshelf.addBook(4,b);
        bookshelf.addBook(5,d);
        bookshelf.addBook(6,f);


        System.out.println("Left to right");
        bookshelf.printLeftToRight();
        System.out.println();
        System.out.println("Right to left");
        bookshelf.printRightToLefts();
        System.out.println();
        System.out.println("Left to Right again");
        bookshelf.printLeftToRight();

        System.out.println();
        System.out.println("Reordered bookshelf!");
        reorder(bookshelf);
        bookshelf.printLeftToRight();

    }
}
