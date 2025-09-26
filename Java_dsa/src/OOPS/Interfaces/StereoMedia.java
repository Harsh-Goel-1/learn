package OOPS.Interfaces;

public class StereoMedia implements Media {

    @Override
    public void start() {
        System.out.println("Stereo starts");
    }

    @Override
    public void stop() {
        System.out.println("Stereo stops");
    }
}
