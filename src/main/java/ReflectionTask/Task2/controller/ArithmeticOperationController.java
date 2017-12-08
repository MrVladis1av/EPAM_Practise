package ReflectionTask.task2.controller;

import ReflectionTask.task2.model.ArithmeticOperation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArithmeticOperationController {
    public ArithmeticOperation createArithmeticOperation(Class<?> arithmeticOperation) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = null;
        for (Constructor<?> elem : arithmeticOperation.getConstructors()) {
            if (elem.getParameterCount() == 0) {
                constructor = elem;
            }
        }

        return (ArithmeticOperation) constructor.newInstance();
    }

    public void changeState(ArithmeticOperation arithmeticOperation, int value) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method setValue = arithmeticOperation.getClass().getDeclaredMethod("setValue", int.class);
        setValue.invoke(arithmeticOperation, value);
    }

    public void incrementValue(ArithmeticOperation arithmeticOperation) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method incrementValue = arithmeticOperation.getClass().getDeclaredMethod("increment");
        incrementValue.invoke(arithmeticOperation);
    }

    public void decrementValue(ArithmeticOperation arithmeticOperation) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method incrementValue = arithmeticOperation.getClass().getDeclaredMethod("decrement");
        incrementValue.invoke(arithmeticOperation);
    }

    public void changeSignValue(ArithmeticOperation arithmeticOperation) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method incrementValue = arithmeticOperation.getClass().getDeclaredMethod("changeSign");
        incrementValue.invoke(arithmeticOperation);
    }
}
