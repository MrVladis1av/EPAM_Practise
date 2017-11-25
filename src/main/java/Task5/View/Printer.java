package Task5.View;

import Task5.Model.Entry;
import Task5.Model.Journal;
import Task5.Util.ResourceManager;

public class Printer {
    public static void printJournal(Journal journal) {

        if (!journal.isEmpty()) {
            for (Entry entry :
                    journal.getEntries()) {
                System.out.println(entry);
            }
        }
    }
    public static void printError(String error){
        System.out.println(error);
    }
}
