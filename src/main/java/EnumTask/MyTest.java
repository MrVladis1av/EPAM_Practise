package EnumTask;

public class MyTest {
    public static void main(String[] args) {
        for (Seasons seasons :
                Seasons.values()) {
            System.out.println(seasons.ordinal());
        }

    }
}
