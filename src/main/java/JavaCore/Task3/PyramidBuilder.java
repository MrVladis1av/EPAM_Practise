package JavaCore.Task3;

import JavaCore.IO.Input;
import JavaCore.IO.Output;

import java.io.IOException;

public class PyramidBuilder {
    private int height;

    /**
     * The method that build the pyramid with defined height
     * @return
     */
    private int[][] buildPyramid() {
        int length = height * 2 - 1;
        int[][] mas = new int[height][length];
        for (int i = 0; i < length; i++) {
            int k = 0;
            for (int j = 0; j < height; j++) {
                if (i < length / 2) {
                    if (j < (height - i - 1)) mas[j][i] = 0;
                    else mas[j][i] = ++k;
                } else {
                    if (j < (i - height + 1)) mas[j][i] = 0;
                    else mas[j][i] = ++k;
                }
            }
        }
        return mas;
    }

    public PyramidBuilder() {
        this.height = 5;
    }

    public PyramidBuilder(int height) {
        this.height = height;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    /**
     * The execution method that computes the results of a task and prints them
     */
    public void run() {
        do {
            try {
                height = Input.readInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (height < 1);
        Output.printPyrmid(buildPyramid());
    }
}
