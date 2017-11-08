package JavaCore.Task2;

import JavaCore.IO.Input;
import JavaCore.IO.Output;

import java.io.IOException;

public class MySearcher {
    private int max;

    /**
     * The method that find all perfect numbers in the range 1 - max
     * @return
     */
    private int[] findBest() {
        int bests[] = new int[max];
        int j = 0;
        for (int i = 0; i < max; i++) {
            if (i == findSum(findDiv(i))) bests[j++] = i;
        }
        return bests;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    /**
     * The method that finds all dividers of number
     * @param num
     * @return
     */
    private int[] findDiv(int num) {
        int[] mas = new int[100];
        int j = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) mas[j++] = i;
        }
        return mas;
    }

    /**
     * The method that calculate the sum of array elements
     * @param mas
     * @return
     */
    private int findSum(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum;
    }

    public MySearcher() {
    }

    public MySearcher(int max) {
        this.max = max;
    }
    /**
     * The execution method that computes the results of a task and prints them
     */
    public void run() {
        do {
            try {
                max = Input.readInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (max < 1);
        Output.printPerfectNumbers(findBest());
    }
}
