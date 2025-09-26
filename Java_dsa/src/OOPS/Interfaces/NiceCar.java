package OOPS.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;
    NiceCar() {
        engine = new PowerEngine();
        media = new StereoMedia();
    }

    public void changeEngine(Engine engine) {
        this.engine = engine;
    }

    public void changeMedia(Media media) {
        this.media = media;
    }

    void startEngine() {
        engine.start();
    }

    void stopEngine() {
        engine.stop();
    }

    void startMusic() {
        media.start();
    }

    void stopMusic() {
        media.stop();
    }

}
