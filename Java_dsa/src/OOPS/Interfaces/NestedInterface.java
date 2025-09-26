package OOPS.Interfaces;

public class NestedInterface {
     interface nest {
        boolean isOdd(int n);
    }

    public static void main(String[] args) {
         B b = new B();
        System.out.println(b.isOdd(5));
    }
}

class B implements NestedInterface.nest {
    public boolean isOdd(int n) {
        return ((n & 1) == 1);
    }
}

