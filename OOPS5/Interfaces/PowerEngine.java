package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts power engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops power engine");
    }

    @Override
    public void acc() {
        System.out.println("Power engine acceleration");
    }
}
