import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');      // Here single quotes means character value
        System.out.println("a" + "b");      // Here double quotes means string value
        System.out.println('a' + 3);        // 100
        System.out.println((char) ('a' + 3)); // d

        System.out.println("a" + 1);        // a1 Whenever a string is concatenated with integer it converts integer to string using wrapper
        System.out.println("pk1" + new ArrayList<>());
    }
}
