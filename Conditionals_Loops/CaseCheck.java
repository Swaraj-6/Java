import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch = (int)(in.next().trim().charAt(0));

        if (ch >= 97 && ch <= 122){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

        System.out.println(ch);
    }
}
