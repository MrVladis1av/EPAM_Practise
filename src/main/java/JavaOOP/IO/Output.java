package JavaOOP.IO;

import JavaOOP.Model.Book;

public class Output {
    public void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) System.out.println(books[i]);
        }
    }
}
