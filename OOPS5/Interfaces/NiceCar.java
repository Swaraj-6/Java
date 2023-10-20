package Interfaces;

public class NiceCar {
    private Engine engine;
    final private Media mediaPlayer = new MediaPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        mediaPlayer.start();
    }

    public void stopMusic() {
        mediaPlayer.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
