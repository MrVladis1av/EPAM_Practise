package JavaOOP.IO;

import JavaOOP.Model.Book;

public class Output {
    public void printBooks(Book[] books) {
        if (books[0] == null) errorMessage();
        else for (int i = 0; i < books.length; i++) {
            if (books[i] != null) System.out.println(books[i]);
        }
        System.out.println("\n");

    }

    public void printMessage(String s) {
        System.out.println(s);
    }

    public void errorMessage() {
        System.out.println("Empty list!!!");
    }
}
