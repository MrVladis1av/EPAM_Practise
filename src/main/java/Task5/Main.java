package Task5;

import Task5.Controller.Application;

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
