package Interfaces;

public class MediaPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Starts media player");
    }

    @Override
    public void stop() {
        System.out.println("Stops media player");
    }
}
