package ReflectionTask.Task2.controller;

import ReflectionTask.Task2.model.ArithmeticOperation;
import ReflectionTask.Task2.view.Output;
import ReflectionTask.util.Input;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static ReflectionTask.Task2.view.IMenu.*;

public class Application {
    Output output;
    ArithmeticOperationController valueController;

    public Application() {
        output = new Output();
        valueController = new ArithmeticOperationController();
    }

    public void run() throws IOException {
        ArithmeticOperation arithmeticOperation = null;
        while (true) {
            output.printString(MEIN_MENU);
            try {
                switch (Input.readString()) {
                    case CREATE_VALUE: {
                        arithmeticOperation = valueController.createArithmeticOperation(ArithmeticOperation.class);
                        break;
                    }

                    case GET_VALUE: {
                        if (arithmeticOperation != null) output.printInt(arithmeticOperation.getValue());
                        else output.printString(NULL_OBJECT);
                        break;
                    }
                    case CHANGE_VALUE: {
                        if (arithmeticOperation != null)
                            valueController.changeState(arithmeticOperation, Input.readInteger());
                        else output.printString(NULL_OBJECT);
                        break;
                    }
                    case INCREMENT_VALUE: {
                        if (arithmeticOperation != null) valueController.incrementValue(arithmeticOperation);
                        else output.printString(NULL_OBJECT);
                        break;
                    }
                    case DECREMENT_VALUE: {
                        if (arithmeticOperation != null) valueController.decrementValue(arithmeticOperation);
                        else output.printString(NULL_OBJECT);
                        break;
                    }
                    case CHANGE_VALUE_SIGN: {
                        if (arithmeticOperation != null) valueController.changeSignValue(arithmeticOperation);
                        else output.printString(NULL_OBJECT);
                        break;
                    }
                    case EXIT: {
                        System.exit(0);
                        break;
                    }

                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

}
