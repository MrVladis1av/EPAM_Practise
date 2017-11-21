package JavaOOP.IO;

import JavaOOP.Model.Book;

public interface Info {
    Book[] library = {
            new Book("Calumet K", "Ayn Rand", "Pearson", 1946, 400, 100),
            new Book("Victory", "Joseph Conrad", "RELX group", 1915, 300, 150),
            new Book("The Wind in the Willows", "Kenneth Grahame", "Pearson", 1908, 340, 125),
            new Book("The Kite Runner", "Khaled Hosseini", "Scholastic", 2003, 372, 200),
            new Book("Alice's Adventures in Wonderland", "Lewis Carroll", "Hachette Livre", 1865, 126, 300),
            new Book("Requiem for a Dream", "Hubert Selby Jr", "RELX Group", 1978, 288, 230),
            new Book("The Great Gatsby", "F Scott Fitzgerald", "Hachette Livre", 1925, 185, 200),
    };
    String INSTRUCTIONS = "Write the ";
    String INVALID_INPUT = "Invalid input! Please try again.";

    interface Menu {
        String GREETINGS = "It`s a program that works with books. Choose any number to choose what to do.";
        String BYE = "Thanks for using our program!";
        String MENU = "" +
                "(1)Get all books.\n" +
                "(2)Get books by author.\n" +
                "(3)Get books by publishing house.\n" +
                "(4)Get books by year.\n" +
                "(5)Sort books by publishing house.\n" +
                "(6)Exit.";
        int GET_ALL_BOOKS = 1;
        int GET_BOOKS_BY_AUTHOR = 2;
        int GET_BOOKS_BY_PUBLISHING_HOUSE = 3;
        int GET_BOOKS_BY_YEAR = 4;
        int GET_BOOKS_SORTED_BY_PUBLISHING_HOUSE = 5;
        int EXIT = 6;
    }
}
