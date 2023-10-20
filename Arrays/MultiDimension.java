import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length);     // No. of rows

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = inp.nextInt();
            }
        }

        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
