package JavaOOP.Controllers;

import JavaOOP.IO.Input;
import JavaOOP.Model.Book;

import java.io.IOException;

public class Application {
    public void run() throws IOException {
        Controller controller = new Controller();
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
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
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
