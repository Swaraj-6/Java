package Abstract_Demo;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }

    public static void print(){
        System.out.println("Hello");
    }

    void greeting(){
        System.out.println("How are you.");
    }
    abstract void career(String name);
    abstract void partner(String name, int age);
}
