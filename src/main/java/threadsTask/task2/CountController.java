package threadsTask.task2;

public class CountController {
    private volatile int counter = 0;
    private boolean flag;

    public void runApp() {
        new Thread(() -> {

            synchronized (this) {
                while (counter < 1_000_000) {
                    while (!flag) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(counter);
                    flag = false;
                    notify();
                }
            }

        }).start();
        new Thread(() -> {
            while (counter < 1_000_000) {

                synchronized (this) {
                    while (flag) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    counter++;
                    flag = true;
                    notify();
                }
            }

        }).start();

    }
}
