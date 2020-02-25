package com.kodilla.collections.adv.immutable.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BookManager {
    private Map<Book, Book> existingBooks;

    public BookManager() {
        this.existingBooks = new HashMap<>();
    }

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (existingBooks.containsKey(book)) {
            return existingBooks.get(book);
        } else {
            existingBooks.put(book, book);
            return book;
        }
    }
}

