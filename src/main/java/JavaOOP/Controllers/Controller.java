package JavaOOP.Controllers;

import JavaOOP.Comparators.PublishingHouseComparator;
import JavaOOP.IO.Info;
import JavaOOP.Model.Book;

import java.util.Arrays;

public class Controller {
    private Book[] booksList;

    public Controller() {
        booksList = new Book[Info.library.length];
        for (int i = 0; i < Info.library.length; i++) {
            booksList[i] = Info.library[i];
        }
    }

    public Controller(Book[] library) {
        booksList = new Book[library.length];
        for (int i = 0; i < library.length; i++) {
            booksList[i] = library[i];
        }
    }

    public Book[] getAllBooks() {
        return booksList;
    }

    public Book[] getBooksByAuthor(String author) {
        Book[] booksByAuthor = new Book[7];
        for (int i = 0, j = 0; i < booksList.length; i++) {
            if (booksList[i].getAuthor().toUpperCase().equals(author.toUpperCase())) booksByAuthor[j++] = booksList[i];
        }
        return booksByAuthor;
    }

    public Book[] getBooksByPublishingHouse(String publishingHouse) {
        Book[] booksByPublishingHouse = new Book[7];
        for (int i = 0, j = 0; i < booksList.length; i++) {
            if (booksList[i].getPublishingHouse().toUpperCase().equals(publishingHouse.toUpperCase()))
                booksByPublishingHouse[j++] = booksList[i];
        }
        return booksByPublishingHouse;
    }

    public Book[] getBooksByYear(int year) {
        Book[] booksByYear = new Book[7];
        for (int i = 0, j = 0; i < booksList.length; i++) {
            if (booksList[i].getYearOfPublishing() > year) booksByYear[j++] = booksList[i];
        }
        return booksByYear;
    }

    public Book[] sortBooksByPublishingHouse() {
        Arrays.sort(booksList, new PublishingHouseComparator());
        return booksList;
    }

}
