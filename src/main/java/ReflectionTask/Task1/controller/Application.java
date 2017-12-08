package ReflectionTask.Task1.controller;

import ReflectionTask.Task1.model.HiddenString;
import ReflectionTask.Task1.view.IMenu;
import ReflectionTask.Task1.view.Output;
import ReflectionTask.util.Input;

import java.io.IOException;

public class Application {
    Output output;
    HiddenStringController hiddenStringController;


    public Application() {
        output = new Output();
        hiddenStringController = new HiddenStringController(new HiddenString());
    }

    public void run() throws IOException {
        while (true) {
            output.printString(IMenu.MAIN_MENU_INFO);
            switch (Input.readString()) {
                case IMenu.PRINT_CURRENT_STRING: {
                    output.printString(hiddenStringController.getString());
                    break;
                }

                case IMenu.CHANGE_STRING: {
                    output.printString(IMenu.PLEASE_WRITE_STRING);
                    hiddenStringController.changeString(Input.readString());
                    break;
                }

                case IMenu.EXIT: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
