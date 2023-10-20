package pk1;

public class InnerClasses {

    class Test1{
        String name;
        public Test1(String name){
            this.name = name;
        }
    }

    // only nested class can be static
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // To use inner non-static class inside a static method we have to create an object of that class
        InnerClasses obj = new InnerClasses();
        InnerClasses.Test1 a = obj.new Test1("Swaraj");
        InnerClasses.Test1 b = obj.new Test1("Rohan");
        System.out.println(a.name);
        System.out.println(b.name);

        // We can use inner static class inside static method
        Test c = new Test("Swaraj");
        Test d = new Test("Rohan");
        System.out.println(c.name);
        System.out.println(d.name);
    }
}
