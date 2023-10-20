import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = inp.nextInt();

        System.out.println("Enter the number to find.");
        int x = inp.nextInt();

        int sum = 0, rem;
        while (n > 0){
            rem = n % 10;
            if (rem == x){
                sum++;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }
}
