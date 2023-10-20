package Interfaces.extends2.DefaultDemo;

public class Main implements B, A {

    @Override
    public void greeting() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        A.hello();
    }
}
