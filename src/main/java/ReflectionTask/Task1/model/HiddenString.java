package ReflectionTask.Task1.model;

public class HiddenString {
    private String string;

    public HiddenString() {
        this.string = "default string";
    }

    public HiddenString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "HiddenString{" +
                "string='" + string + '\'' +
                '}';
    }
}
