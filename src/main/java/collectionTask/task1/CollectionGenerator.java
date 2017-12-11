package collectionTask.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionGenerator {
    private List list;
    private Set set;

    public CollectionGenerator() {
        list = new ArrayList();
        set = new HashSet();
    }

    public void generateList(int quantity, int min, int max) {
        for (int i = 0; i < quantity; i++) {
            list.add((int) (Math.random() * (max - min)) + min);
        }
    }

    public void generateSet(int quantity, int min, int max) {
        for (int i = 0; i < quantity; i++) {
            set.add((int) (Math.random() * (max - min)) + min);
        }
    }

    public void printCollections() {
        System.out.println(list);
        System.out.println(set);
    }
}
