package ReflectionTask;

import ReflectionTask.task2.controller.Application;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Application().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
