package com.kodilla.collections.adv.immutable.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> existingBooks;

    public BookManager() {
        this.existingBooks = new ArrayList<>();
    }

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (existingBooks.contains(book)) {
            return book;
        }
        existingBooks.add(book);
        return book;
    }
}

