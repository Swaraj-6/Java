public class Wrapper {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a,b);  // Here it still won't change as it is final

        final int z = 43;
//        z = 5;  It is not allowed as it has final keyword

        final A swaraj = new A("pk1");
        swaraj.name = "Swaraj kakade";

//        swaraj = new A("New object");  When a non primitive is final, we cannot resign it.
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    A(String name){
        this.name = name;
    }
}
