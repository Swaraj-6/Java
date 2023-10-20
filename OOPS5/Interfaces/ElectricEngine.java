package Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops electric engine");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine acceleration");
    }
}
