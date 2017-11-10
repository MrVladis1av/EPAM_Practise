package JavaOOP.Controllers;

import JavaOOP.IO.Input;
import JavaOOP.Model.Book;

import java.io.IOException;

public class Application {
    public void run() throws IOException {
        Controller controller = new Controller();


        int k;
        do {
            System.out.println("(1)Get books by author.\n" +
                    "(2)Get books by publishing house.\n" +
                    "(3)Get boks that was published after specified year.\n" +
                    "(4)Sort books by publishing house.\n" +
                    "(5)Exit.");
            k = Input.readinteger();
            switch (k) {
                case 1: {
                    printBooks(controller.getBooksByAuthor(Input.readString()));
                    System.out.flush();
                    break;
                }
                case 2: {
                    printBooks(controller.getBooksByPublishingHouse(Input.readString()));
                    break;
                }
                case 3: {
                    printBooks(controller.getBooksByYear(Input.readinteger()));
                    break;
                }
                case 4: {
                    printBooks(controller.sortBooksByPublishingHouse());
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }

            }
        } while (true);
    }

    public void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) System.out.println(books[i]);
        }
    }
}
