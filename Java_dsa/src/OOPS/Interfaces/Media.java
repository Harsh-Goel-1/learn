package OOPS.Interfaces;

public interface Media {
    public static final int STEREO_PRICE = 45000;
    // public static and final are default for interfaces, so these keywords are redundant
    void start();
    void stop();
}
