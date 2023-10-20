public class Shadowing {
    static int x = 20; // This will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);  // 20
        int x ;
//        Scope will begin after the initialization not declaration
        x = 10;     // Now scope will begin
        System.out.println(x);  // 10
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
