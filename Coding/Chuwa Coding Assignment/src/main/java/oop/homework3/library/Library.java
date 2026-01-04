package oop.homework3.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibrary() {
        for (Book book : books) {
            System.out.println("title=" + book.getTitle() + ", isbn=" + book.getIsbn());
        }
    }
}




