package EnumTask;

import java.util.ArrayList;

public class Seasons extends MyEnum<Seasons> {

    protected Seasons(String name) {
        super(name);
    }

    public static ArrayList<Seasons> values() {
        return (ArrayList<Seasons>) VALUES;
    }

    public static final Seasons WINTER;
    public static final Seasons SPRING;
    public static final Seasons SUMMER;
    public static final Seasons FALL;
    private static final ArrayList VALUES;

    static {
        WINTER = new Seasons("WINTER");
        SPRING = new Seasons("SPRING");
        SUMMER = new Seasons("SUMMER");
        FALL = new Seasons("FALL");
        VALUES = MyEnum.values();
    }
}
