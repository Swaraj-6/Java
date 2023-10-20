import java.util.Arrays;
import java.util.Scanner;

public class BSearch {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the no. of elements in an array");
        int n = inp.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("Enter the element to be searched");
        int k = inp.nextInt();

        System.out.println(BinarySearch(arr, n, k)+1);

    }
    public static int BinarySearch(int[] arr, int n, int k){
        int left = 0;
        int right = n-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if (arr[mid] == k){
                return mid;
            } else if (arr[mid] > k) {
                right = mid-1;
            } else{
                left = mid+1;
            }
        }

        return -1;
    }
}
