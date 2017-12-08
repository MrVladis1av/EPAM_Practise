package ReflectionTask.Task1.controller;

import ReflectionTask.Task1.model.HiddenString;

import java.lang.reflect.Field;

public class HiddenStringController {
    HiddenString hiddenString;

    public HiddenStringController(HiddenString hiddenString) {
        this.hiddenString = hiddenString;
    }

    public String getString() {
        return hiddenString.getString();
    }

    public void changeString(String s) {
        try {
            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(hiddenString.getString(), s.toCharArray());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
