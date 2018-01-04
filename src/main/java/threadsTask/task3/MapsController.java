package threadsTask.task3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapsController {
    private Map<Integer, Integer> hashMap = new HashMap<>();
    private Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    private final int CONST = 10000;

    public void runTask() {
        int[] keys = new int[CONST];
        int[] values = new int[CONST];
        for (int i = 0; i < CONST; i++) {
            keys[i] = (int) (Math.random() * 100);
            values[i] = (int) (Math.random() * 100);
        }
        fillMatrix(keys, values);
        getFromMap();
    }

    private void fillMatrix(int[] keys, int[] values) {
        long start = new Date().getTime();
        new Thread(() -> {
            for (int i = 0; i < keys.length; i++) {
                hashMap.put(keys[i], values[i]);
            }
        }).start();

        long end = new Date().getTime();
        System.out.println("Time simple: " + (end - start));
        System.out.println("---------------------------------------");
        start = new Date().getTime();
        new Thread(() -> {
            for (int i = 0; i < keys.length; i++) {
                concurrentHashMap.put(keys[i], values[i]);
            }

        }).start();
        end = new Date().getTime();
        System.out.println("Time concurent: " + (end - start));

    }

    private void getFromMap() {
        new Thread(() -> {
            long start = new Date().getTime();
            synchronized (this) {
                for (Map.Entry entry :
                        hashMap.entrySet()) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
            }
            long end = new Date().getTime();
            System.out.println("Time simple: " + (end - start));
            System.out.println("---------------------------------------");
            start = new Date().getTime();
            for (Map.Entry entry :
                    concurrentHashMap.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            end = new Date().getTime();
            System.out.println("Time concurent: " + (end - start));
        }).start();

    }
}

