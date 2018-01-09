package Java9Task;

import Java9Task.task2.Task2;
import Java9Task.task5.controller.IntegerStreamController;
import Java9Task.task5.controller.PersonController;

public class Test {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2);
        task2.sortMass();
        task2.sortList();
        System.out.println(task2);
        System.out.println();
        System.out.println(task2.getBiggerThen(task2.getMas(), x -> x > 50));
        System.out.println(task2.getStringsByLetter(task2.getStringList(), x -> x.startsWith("a")));
        System.out.println(task2.toUpperCase(x -> x.toUpperCase()));

        System.out.println(new IntegerStreamController().getTaskResult());
        System.out.println(new PersonController().getAllSoldiers());
        System.out.println(new PersonController().getAverageAgeOfWomen());
    }
}
