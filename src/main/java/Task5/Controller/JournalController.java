package Task5.Controller;

import Task5.Model.Entry;
import Task5.Model.Journal;

import java.util.ArrayList;

public class JournalController {
    private Journal journal;

    public JournalController() {
        journal = new Journal();
    }

    public JournalController(Journal journal) {
        this.journal = journal;
    }

    public ArrayList getAllEntries() {
        return journal.getEntries();
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public void addEntry(Entry entry) {
        journal.addEntry(entry);
    }


}
