package OOPS.Abstract;

public class son extends Parent{
    son(int age) {
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("I am a singer");
    }
}
