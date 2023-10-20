package Abstract_Demo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("I will become "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partner will be "+ name + " and his age is "+ age);
    }
}
