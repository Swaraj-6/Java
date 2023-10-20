public class RecursionBasics {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int i){
        if (i == 5){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        print(i+1);
    }
}
