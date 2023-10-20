import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Swaraj Kakade";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("    swaraj    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.length());

    }
}
