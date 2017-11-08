package JavaCore.Task1;

import JavaCore.IO.Input;
import JavaCore.IO.Output;

import java.io.IOException;
import java.util.Arrays;

public class Converter {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Converter() {
    }

    /**
     * Method that check if number is positive and real
     * @param num
     * @return
     */
    private boolean findPositiveAndReal(double num) {
        if (num % (int) num == 0 && num >= 0) return true;
        return false;
    }

    /**
     * The method that converts decimal number to binary
     * @param num
     * @param bits
     * @return
     */
    public int[] decToBinary(int num, int bits) {
        int[] binaryNum = new int[bits];
        Arrays.fill(binaryNum, 0);
        int i = 0;
        while (num != 0) {
            binaryNum[i] = num % 2;
            num /= 2;
            i++;
        }
        return binaryNum;
    }

    /**
     * The method that converts decimal number to octal
     * @param num
     * @param bits
     * @return
     */
    public int[] decToOct(int num, int bits) {
        int[] mas = new int[bits];
        boolean flag = true;
        int i = 0;
        while (true) {
            mas[i] = num % 8;
            num /= 8;
            i++;
            if (num < 8) {
                mas[i] = num;
                break;
            }
        }
        return mas;
    }

    /**
     * The method that converts decimal number to hexadecimal
     * @param num
     * @param bits
     * @return
     */
    public char[] decToHex(int num, int bits) {
        char[] mas = new char[bits];
        int j = 0;
        int[] sup = new int[bits];
        while (num > 16) {
            sup[j] = num % 16;
            num /= 16;
            j++;
        }
        sup[j] = num;

        for (int i = 0; i < sup.length; i++) {
            switch (sup[i]) {
                case 10: {
                    mas[i] = 'A';
                    break;
                }
                case 11: {
                    mas[i] = 'B';
                    break;
                }
                case 12: {
                    mas[i] = 'C';
                    break;
                }
                case 13: {
                    mas[i] = 'D';
                    break;
                }
                case 14: {
                    mas[i] = 'E';
                    break;
                }
                case 15: {
                    mas[i] = 'F';
                    break;
                }
                default: {
                    mas[i] = (char) (sup[i] + 48);
                }
            }
        }
        return mas;
    }

    /**
     * The execution method that computes the results of a task and prints them
     */
    public void run() {
        double sup = 0;
        do {
            try {
                sup = Input.readDouble();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!findPositiveAndReal(sup));
        num = (int) sup;

        Output.printConvertedNums(decToBinary(num, 8), decToOct(num, 8), decToHex(num, 8), num);
    }


}
