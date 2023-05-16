package corejava_assignments.assignment6;

public class TwoConstructorClass {

        private int num1;
        private int num2;

    public TwoConstructorClass(int num1) {
        this(num1, 0);
    }

    public TwoConstructorClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
