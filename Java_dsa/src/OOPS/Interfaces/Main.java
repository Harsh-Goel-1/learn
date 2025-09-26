package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car carr = new Car();
        Media car = new Car();
        System.out.println(carr.model);
        // --> dynamic method dispatch / runtime polymorphism / late binding
        // reference type is Media, object is Car
        // when car.start() is called, it is decided at *runtime* which start() method to invoke
        // HENCE, DO NOT USE interfaces casually in performance critical code

        // --> System.out.println(car.model); gives illegal, cant access model
        // car.honk(); is also illegal obv

        //Engine is the amount of access we have to data, (compile time, if Car is a valid child of Engine)
        //remember parent classes do not have info of child classes?
        //new Car() gives us the version of the info we have access to (run time, actual Car object is created)

        car.stop(); // I want to stop media, but I can have only 1 start method...
        NiceCar nicecar = new NiceCar();
        nicecar.startEngine();
        nicecar.startMusic();
        Engine eg = new ElectricEngine();
        Media cd = new CDplayerMedia();
        nicecar.changeEngine(eg);
        nicecar.changeMedia(cd);
        nicecar.startEngine();
        nicecar.startMusic();
    }
}
