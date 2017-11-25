package Task5.Model;

import java.util.ArrayList;

public class Journal {

    private ArrayList<Entry> entries;

    public Journal() {
        entries = new ArrayList<>();
    }

    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public ArrayList<Entry> getEntries() {
        return (ArrayList<Entry>) entries.clone();
    }

    public void addEntry(Entry e) {
        if (e != null) entries.add(e);
    }

    public void deleteLog(Entry e) {
        if (e != null) entries.remove(e);
    }


}
