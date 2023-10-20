import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = inp.nextInt();

        int rem = 0, ans = 0;
        while (n > 0){
            rem = n % 10;
            ans = (ans*10) + rem;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
