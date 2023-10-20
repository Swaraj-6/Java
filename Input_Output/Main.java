import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking multiple integer inputs
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Clear the buffer (consume the newline character) after reading the double
        scanner.nextLine();

        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Displaying the inputs
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);

        // Close the scanner to free resources (good practice)
        scanner.close();
    }
}
