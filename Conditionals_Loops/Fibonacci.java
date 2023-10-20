import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = inp.nextInt();

        if (n == 0){
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        }else{
            for(int i = 2; i <= n; i++){
                sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println(sum);
        }

    }
}
