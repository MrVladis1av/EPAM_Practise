package threadsTask;


import threadsTask.task2.CountController;
import threadsTask.task3.MapsController;
import threadsTask.task4.SumForkJoin;

import java.util.concurrent.ForkJoinPool;

public class Main {


    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    System.out.println(10 - i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Bomb!");
        }).run();

    }
}
