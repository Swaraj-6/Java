import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println("The sum is "+ans);
//        System.out.println(greeting());
        String personalizedMessage = args("Swaraj Kakade");
        System.out.println(personalizedMessage);
    }

    /*
        access-modifier return_type name (arguments) {
                // body
                return statement;
        }

     */
    static String args(String name){
        String message = "Hello "+ name;
        return message;
    }

    static String greeting(){
        return "Hi, how are you.";
    }
    static int sum2(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int num1 = inp.nextInt();

        System.out.println("Enter 2nd no.");
        int num2 = inp.nextInt();

        return num1 + num2;
    }

    static void sum(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int num1 = inp.nextInt();

        System.out.println("Enter 2nd no.");
        int num2 = inp.nextInt();

        System.out.println("The sum is "+ (num1+num2));
    }

}
