package Interfaces.extends2.DefaultDemo;

public interface A {

    static void hello(){
        System.out.println("Hello from A");
    }
    default void fun(){
        System.out.println("Inside A");
    }
}
