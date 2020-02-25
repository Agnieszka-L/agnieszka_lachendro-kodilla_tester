package com.kodilla.collections.adv.immutable.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Harry Potter", "Rowling");
        Book book2 = bookManager.createBook("The Witcher", "Sapkowski");
        Book book3 = bookManager.createBook("The Witcher", "Sapkowski");
        Book book4 = book1;
        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        System.out.println(book1 == book3);
        System.out.println(book1 == book4);

        System.out.println("----------------");
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals("dfrf"));
        System.out.println(book1.equals(null));
        System.out.println(book1.equals(book1));
    }
}
