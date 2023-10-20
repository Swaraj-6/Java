import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,6545,54,34,4654,65);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
