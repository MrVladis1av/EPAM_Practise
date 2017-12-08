package ReflectionTask.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static String readString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static int readInteger() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }
}
