package pk1;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(21, "Swaraj Kakade", 76544, false);
        System.out.println(Human.population);
        Human h2 = new Human(22, "Rohan", 87456, true);
        System.out.println(Human.population);
        System.out.println(h2.population);


        fun();
    }
    public static void message(){
        System.out.println("Hello I am from pk1 package.");
    }


    static void fun(){
        // But if you create a new object in static method and call non-static methods using that
        // object then it is possible
        Main obj = new Main();
        obj.greeting();
    }

    // Here greeting is non-static method so it belongs to an object and hence cannot be called
    // from a static method like main which are not dependent on object
    void greeting(){
        System.out.println("Hello world");
    }
}
