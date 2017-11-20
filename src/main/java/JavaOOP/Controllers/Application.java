package JavaOOP.Controllers;

import JavaOOP.IO.Input;
import JavaOOP.IO.Output;

import java.io.IOException;

public class Application {
    public void run() throws IOException {
        Controller controller = new Controller();
        Output printer = new Output();
        int k;
        do {
            System.out.println("" +
                    "(1)Get books by author.\n" +
                    "(2)Get books by publishing house.\n" +
                    "(4)Sort books by publishing house.\n" +
                    "(5)Exit.");
            k = Input.readInteger();
            switch (k) {
                case 1: {
                    printer.printBooks(controller.getBooksByAuthor(Input.readString()));
                    break;
                }
                case 2: {
                    printer.printBooks(controller.getBooksByPublishingHouse(Input.readString()));
                    break;
                }
                case 3: {
                    printer.printBooks(controller.getBooksByYear(Input.readInteger()));
                    break;
                }
                case 4: {
                    printer.printBooks(controller.sortBooksByPublishingHouse());
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }

            }
        } while (true);
    }

}
