package Task5.Controller;

import Task5.Model.Entry;
import Task5.Util.ResourceManager;
import Task5.View.Menu;
import Task5.View.Printer;

import java.io.IOException;
import java.util.Locale;
import java.util.regex.Pattern;

import static Task5.View.IMenuInfo.*;

public class Application {
    ResourceManager resourceManager;
    private JournalController journalController;
    private Menu mainMenu;

    public Application() {
        resourceManager = ResourceManager.INSTANCE;
        mainMenu = new Menu();
        journalController = new JournalController();
    }

    public void run() throws IOException {
        chooseLanguage();

        while (true) {
            System.out.println();
            mainMenu.printMainMenu();
            switch (Input.readString()) {
                case GET_ALL_ENTRIES:
                    Printer.printJournal(journalController.getJournal());
                    if (journalController.getJournal().isEmpty())
                        Printer.printError(ResourceManager.INSTANCE.getString(Errors.EMPTY_JOURNAL_ERROR));
                    break;
                case ADD_NEW_ENTRY:
                    addEntry();
                    break;
            }
        }

    }

    public void addEntry() {
        journalController.addEntry(new Entry
                .EntryBuilder(readString(resourceManager.getString(ISubMenu.WRITE_THE_NAME), resourceManager.getString(IRegularExpressions.CHECK_FIRST_NAME)),
                readString(resourceManager.getString(ISubMenu.WRITE_THE_SURNAME), resourceManager.getString(IRegularExpressions.CHECK_SECOND_NAME)))
                .birthday(readString(resourceManager.getString(ISubMenu.WRITE_THE_BIRTHDAY), resourceManager.getString(IRegularExpressions.CHECK_BIRTHDAY)))
                .homeAddress(readString(resourceManager.getString(ISubMenu.WRITE_THE_PHONE_NUMBER), resourceManager.getString(IRegularExpressions.CHECK_PHONE_NUMBER)))
                .phoneNumber(readString(resourceManager.getString(ISubMenu.WRITE_THE_ADDRESS), resourceManager.getString(IRegularExpressions.CHECK_ADDRESS)))
                .build()
        );
    }

    public String readString(String message, String rexExp) {
        String result;
        while (true) {
            System.out.println(message);
            try {
                result = Input.readString();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Wrong input called IOException!!!");
                continue;
            }
            if (checkRegExp(result, rexExp)) return result;
            else System.out.println("Wrong input! Try again.");
        }
    }

    public void chooseLanguage() {
        mainMenu.printChooseLanguage();
        String lang;
        try {
            lang = Input.readString();
        } catch (IOException e) {
            e.printStackTrace();
            lang = "en";
        }

        switch (lang) {
            case "ru":
                changeLanguage("ru");
                break;
            case "eng":
                changeLanguage("en");
                break;
            case "uk":
                changeLanguage("uk");
                break;
        }
    }

    public void changeLanguage(String lang) {
        resourceManager.changeResource(new Locale(lang));
    }

    public boolean checkRegExp(String name, String regExp) {
        Pattern p = Pattern.compile(regExp);
        return p.matcher(name).find();
    }
}
