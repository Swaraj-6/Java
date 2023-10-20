package Abstract_Demo;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(21);
        Daughter daughter = new Daughter(25);
        son.career("Doctor");
        daughter.career("Coder");

        System.out.println(son.age);
        System.out.println(daughter.age);

        Parent.print();
        son.greeting();
    }
}
