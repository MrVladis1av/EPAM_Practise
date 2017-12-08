package ReflectionTask.task2.model;

public class ArithmeticOperation {
    private int value;

    public ArithmeticOperation() {
        value = 5;
    }

    public ArithmeticOperation(ArithmeticOperation arithmeticOperation) {
        this.value = arithmeticOperation.getValue();
    }

    public ArithmeticOperation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void changeSign() {
        value = -value;
    }
}
