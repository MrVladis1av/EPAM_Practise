package collectionTask.task2;

import java.util.HashMap;

public class Translator {
    private HashMap<String, String> dictionary;

    public Translator() {
        dictionary = new HashMap<>();
    }

    public Translator(HashMap<String, String> dictionary) {
        this.dictionary = new HashMap<>(dictionary);
    }

    public String translateString(String s) {

        String[] splitedMessage = split(s);

        String result = "";
        for (String str :
                splitedMessage) {

            result += dictionary.get(str) + " ";
        }

        return result;
    }

    private String[] split(String s) {
        return s.split(" ");
    }
}
