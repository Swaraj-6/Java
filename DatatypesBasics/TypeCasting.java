import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        int num = (int)(67.56f);
        System.out.println(num);

        Scanner input = new Scanner(System.in);

//        int num2 = (int)(input.nextFloat());
//        System.out.println(num2);

        //Automatic type promotion in expressions

//        int a = 257;
//        byte b = (byte) (a); // 257 % 256 = 1
//
//        byte x = 40;
//        byte y = 50;
//        byte z = 100;
//
//        int d = (x*y)/z;
//        System.out.println(d);
//
//        int number = 'A';
//        System.out.println(number); // 65

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
