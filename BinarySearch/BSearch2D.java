import java.util.Arrays;

public class BSearch2D {
    public static void main(String[] args) {
        int [][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {18, 28, 38, 48},
                {22, 32, 42, 52}
        };

        System.out.println(Arrays.toString(search(arr, 38)));
    }
    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;

        while (row < arr.length && col >= 0){
            if (arr[row][col] == target){
                return new int[]{row,col};
            } else if (arr[row][col] < target) {
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
