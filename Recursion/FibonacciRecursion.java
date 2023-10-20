import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        System.out.println(fibonacci(n));
    }
    
    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
}
