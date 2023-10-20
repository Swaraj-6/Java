import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] = 4323;
    }
}
