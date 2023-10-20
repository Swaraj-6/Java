import java.util.Scanner;

public class Basics_Loops {
    public static void main(String[] args) {

        /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        for (int count = 1; count <= 5; count++){
            System.out.println(count);
        }

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for (int i = 0; i < n; i++){
//            System.out.println("Hi");
//        }

        // while loops
        /*
            Syntax:
            while (condition) {
                // body
            }
         */
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        // do while
        /*

            do {
                // body
            } while (condition);

         */

        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while (n!=5);

    }
}
