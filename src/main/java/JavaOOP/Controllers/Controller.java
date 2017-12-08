package JavaOOP.Controllers;

import JavaOOP.Comparators.PublishingHouseComparator;
import JavaOOP.IO.Info;
import JavaOOP.Model.Book;

import java.io.*;
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

    public void saveToFile(String fileName) {
        File file = new File("D:\\Git\\EPAM_Practise\\src\\main\\java\\JavaOOP\\Saves\\" + fileName + ".ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < booksList.length; i++) objectOutputStream.writeObject(booksList[i]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Book[] getBooksFromFile(String fileName) {
        Book[] books = new Book[booksList.length];
        File file = new File("D:\\Git\\EPAM_Practise\\src\\main\\java\\JavaOOP\\Saves\\" + fileName + ".ser");
        try (ObjectInputStream objectOutputStream = new ObjectInputStream(new FileInputStream(file))) {
            for (int i = 0; i < booksList.length; i++) {
                books[i] = (Book) objectOutputStream.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            return books;
        }
    }

    public Book[] sortBooksByPublishingHouse() {
        Arrays.sort(booksList, new PublishingHouseComparator());
        return booksList;
    }

}
