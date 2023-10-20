import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];

        int[] rollnos = new int[5];
        // or directly
        int[] rollnos2 = {10,20,30,40,50};

        int[] arr;  // Declaration of array ros is getting defined in stack
        arr = new int[5]; // Initialization of memory actual object is getting created here

        Scanner inp = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = inp.nextInt();
        }

        for(int i: arr){
            System.out.println(i); // Here i represents each the elements in the array
        }

        System.out.println(java.util.Arrays.toString(arr));  // Basically here it formats our array into a string in a representational form

        inp.next();
        String[] starr = new String[4];
        for(int i = 0; i < starr.length; i++){
            starr[i] = inp.nextLine();
        }

        System.out.println(java.util.Arrays.toString(starr));
    }
}
