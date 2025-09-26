package OOPS.Interfaces;

public class Car implements Media,Engine{

    String model = "32z99";
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    public void honk() {
        System.out.println("HONK HONK");
    }
}
