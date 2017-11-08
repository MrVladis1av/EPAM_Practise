package JavaCore.IO;

public class Output {

    public Output() {
    }

    /**
     * The method that prints the result for third task
     * @param mas
     */
    public static void printPyrmid(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 0) System.out.print("  ");
                else System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * The method that prints the fourth task
     * @param mas
     */
    public static void printMatrix(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * The method that prints the second task
     * @param mas
     */
    public static void printPerfectNumbers(int[] mas) {
        System.out.print("Perfect numbers: ");
        for (int k :
                mas) {
            if (k != 0) System.out.print(k + " ");
        }
        System.out.println();

    }

    /**
     * The method that prints binary, octal and hexadecimal representation of decimal number
     * @param bin
     * @param oct
     * @param hex
     * @param num
     */
    public static void printConvertedNums(int bin[], int oct[], char hex[], int num) {
        System.out.println("Decimal number: " + num);
        System.out.print("Binary number: ");
        for (int i = bin.length - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
        System.out.println();

        System.out.print("Octal number: ");
        for (int i = oct.length - 1; i >= 0; i--) {
            System.out.print(oct[i]);
        }
        System.out.println();

        System.out.print("Hex number: ");
        for (int i = hex.length - 1; i >= 0; i--) {
            System.out.print(hex[i]);
        }
        System.out.println();

    }
}
