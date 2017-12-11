package collectionTask;

import collectionTask.task1.CollectionGenerator;
import collectionTask.task2.Translator;
import collectionTask.task3.RedBlackTree;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CollectionGenerator collectionGenerator = new CollectionGenerator();
        collectionGenerator.generateList(20, 5, 18);
        collectionGenerator.generateSet(15, 10, 28);
        collectionGenerator.printCollections();
        Translator translator = new Translator(new HashMap<String, String>() {{
            put("MY", " МОЕ");
            put("NAME", "ИМЯ");
            put("RIVER", "РЕКА");
            put("KEY", "КЛЮЧ");
            put("SNAKE", "ЗМЕЯ");
            put("LAKE", "ОЗЕРО");
            put("TREE", "ДЕРЕВО");
            put("BEE", "ПЧЕЛА");
            put("BLOOD", "КРОВЬ");
            put("CODE", "КОД");
            put("COMPUTER", "КОМПЪЮТЕР");
            put("DATA", "ДАННЫЕ");
            put("CAR", "МАШИНА");
        }});

        System.out.println(translator.translateString("MY NAME CAR"));
        RedBlackTree tree = new RedBlackTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);

        tree.inorder();

        //tree.drawInConsole();
    }


}
