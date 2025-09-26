package OOPS.Interfaces;

public class CDplayerMedia implements Media {

    @Override
    public void start() {
        System.out.println("CD starts");
    }

    @Override
    public void stop() {
        System.out.println("CD stops");
    }
}
