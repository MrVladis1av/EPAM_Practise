package EnumTask;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class MyEnum<E extends MyEnum<E>> implements Comparable<MyEnum>, Serializable {

    private final String name;

    public final String name() {
        return name;
    }

    private final int ordinal;

    public final int ordinal() {
        return ordinal;
    }

    private static final ArrayList<MyEnum> values = new ArrayList<MyEnum>();

    protected MyEnum(String name) {
        this.name = name;
        this.ordinal = values.size();
        values.add(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public final boolean equals(Object other) {
        return this == other;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public int compareTo(MyEnum o) {
        if (this.getClass() != o.getClass() && // optimization
                this.getDeclaringClass() != o.getDeclaringClass())
            throw new ClassCastException();
        return this.ordinal - o.ordinal;
    }

    public final Class<MyEnum> getDeclaringClass() {
        Class<?> clazz = getClass();
        Class<?> zuper = clazz.getSuperclass();
        return (zuper == Enum.class) ? (Class<MyEnum>) clazz : (Class<MyEnum>) zuper;
    }

    public static MyEnum valueOf(String name) {
        if (name == null)
            throw new NullPointerException("Name is null");
        for (MyEnum obj :
                values) {
            if (obj.name().equals(name)) return obj;
        }

        throw new IllegalArgumentException(
                "No enum constant " + name + ".");
    }

    public static ArrayList values() {
        return values;
    }

    @Override
    protected final void finalize() {
    }


}
