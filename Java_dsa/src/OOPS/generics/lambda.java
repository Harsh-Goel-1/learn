package OOPS.generics;

public class lambda {
    private interface Operation {
        int operation(int a, int b);
//        int random(int a, int b);
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }

    public static void main(String[] args) {

        Operation prod = (a, b) -> a * b;
        //prod.operation(a, b) -> a * b;
    }
}
