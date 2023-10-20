package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.acc();
//        car.start();
//        car.brake();
//        car.stop();
//
//        Engine ref = new Car();
//        ref.acc();
//        ref.start();
////        ref.brake();     Cannot access those methods or attributes which are not overridden of that class
//        ref.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
