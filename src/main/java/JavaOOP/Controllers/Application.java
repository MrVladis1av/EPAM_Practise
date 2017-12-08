package JavaOOP.Controllers;

import JavaOOP.IO.Info;
import JavaOOP.IO.Input;
import JavaOOP.IO.Output;

import java.io.IOException;

import static JavaOOP.IO.Info.*;

public class Application {
    public void run() throws IOException {
        Controller controller = new Controller();
        Output printer = new Output();
        int key;
        do {
            System.out.println(Menu.GREETINGS);
            System.out.println(Menu.MENU);
            try {
                key = Input.readInteger();
            } catch (NumberFormatException e) {
                System.out.println(Info.INVALID_INPUT);
                continue;
            }

            switch (key) {
                case Menu.GET_ALL_BOOKS: {
                    printer.printBooks(controller.getAllBooks());
                    break;
                }
                case Menu.GET_BOOKS_BY_AUTHOR: {
                    System.out.println(Info.INSTRUCTIONS + "name of author");
                    printer.printBooks(controller.getBooksByAuthor(Input.readString()));
                    break;
                }
                case Menu.GET_BOOKS_BY_PUBLISHING_HOUSE: {
                    System.out.println(Info.INSTRUCTIONS + "name of publishing house");
                    printer.printBooks(controller.getBooksByPublishingHouse(Input.readString()));
                    break;
                }
                case Menu.GET_BOOKS_BY_YEAR: {
                    System.out.println(Info.INSTRUCTIONS + "year");
                    printer.printBooks(controller.getBooksByYear(Input.readInteger()));
                    break;
                }
                case Menu.GET_BOOKS_SORTED_BY_PUBLISHING_HOUSE: {
                    printer.printBooks(controller.sortBooksByPublishingHouse());
                    break;
                }
                case Menu.SAVE_AS_FILE: {
                    //TODO
                    printer.printMessage(ISubMenu.CHOOSE_FILE_NAME);
                    controller.saveToFile(Input.readString());
                    break;
                }
                case Menu.GET_BOOKS_FROM_FILE: {
                    printer.printMessage(ISubMenu.CHOOSE_FILE_NAME);
                    printer.printBooks(controller.getBooksFromFile(Input.readString()));
                    break;
                }
                case Menu.EXIT: {
                    System.out.println(Menu.BYE);
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println(Info.INVALID_INPUT);
                    break;
                }

            }
        } while (true);
    }

}
