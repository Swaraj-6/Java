import java.util.Scanner;

public class RecursiveBSearch {
    public static void main(String[] args) {
        int[] arr = {12,34,53,63,84,85,95};
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        int i = 0;
        int j = arr.length;
        System.out.println(search(arr, i, j, k));
    }
    static int search(int[] arr, int i, int j, int k){
        int mid = (i+j)/2;
        if (arr[mid] == k){
            return mid;
        } else if (arr[mid] > k) {
            return search(arr, i, mid-1, k);
        }else{
            return search(arr, mid+1, j, k);
        }
    }
}
