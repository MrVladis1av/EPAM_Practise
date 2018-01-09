package Java9Task.task2;

import java.util.*;
import java.util.function.Predicate;

public class Task2 {
    private Integer[] mas;
    private List<String> stringList;

    public Task2() {
        mas = new Integer[10];
        stringList = new ArrayList<>();
        initialization();
    }

    private void initialization() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        stringList.add("ab");
        stringList.add("ac");
        stringList.add("ad");
        stringList.add("ba");
        stringList.add("wq");
        stringList.add("wz");
    }

    public void sortMass() {
        Arrays.sort(mas, (a, b) -> b.compareTo(a));
    }

    public void sortList() {
        Collections.sort(stringList, (a, b) -> b.compareTo(a));
    }

    public List<Integer> getBiggerThen(Integer[] mas, Predicate<Integer> predicate) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : mas) {
            if (predicate.test(i)) list.add(i);
        }
        return list;
    }

    public Integer[] getMas() {
        return mas;
    }

    public void setMas(Integer[] mas) {
        this.mas = mas;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public List<String> getStringsByLetter(List<String> arrays, Predicate<String> predicate) {
        List<String> list = new ArrayList<>();
        for (String s : arrays) {
            if (predicate.test(s)) list.add(s);
        }
        return list;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @FunctionalInterface
    interface MyInterface {
        void convert(String s);

        static boolean isEmpty(String s) {
            return s.length() == 0 ? true : false;
        }
    }

    @FunctionalInterface
    public interface ToUpperCaseInterface {
        String myToUpperCase(String s);
    }

    public List<String> toUpperCase(ToUpperCaseInterface toUpperCaseInterface) {
        List<String> list = new ArrayList<>();
        for (String s : stringList) {
            list.add(toUpperCaseInterface.myToUpperCase(s));
        }
        return list;
    }

    @Override
    public String toString() {
        return "Task2{" +
                "mas=" + Arrays.toString(mas) +
                ", stringList=" + stringList +
                '}';
    }
}
