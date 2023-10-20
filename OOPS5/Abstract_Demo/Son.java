package Abstract_Demo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I will become "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partner will be "+ name + " and her age is "+ age);
    }
}
