package JavaCore.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public Input() {
    }

    /**
     * The method that read a double number
     * @return
     * @throws IOException
     */
    public static double readDouble() throws IOException {
        return Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Method that read an integer number
     * @return
     * @throws IOException
     */
    public static int readInt() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }
}
