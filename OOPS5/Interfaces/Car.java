package Interfaces;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("car braking.");
    }

    @Override
    public void start() {
        System.out.println("Car engine starting.");
    }

    @Override
    public void stop() {
        System.out.println("car engine stopping");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerating");
    }
}
