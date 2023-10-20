import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,45,135,56,345};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            int temp = arr[maxIndex];
            arr[maxIndex] =  arr[last];
            arr[last] = temp;
        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for (int i=0; i<=last; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
