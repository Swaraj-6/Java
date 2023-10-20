import java.util.*;

public class Searching {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the no. of elements in array");
        int n = inp.nextInt();

        System.out.println("Enter the elements in the array");
        for(int i=0; i<n; i++){
            list.add(inp.nextInt());
        }

        System.out.println("Enter the elements to be searched");
        int k = inp.nextInt();

        System.out.println(linearSearch(list, n, k));
    }

    public static int linearSearch(ArrayList<Integer> arr, int n, int k){
        if (n == 0){
            return -1;
        }
        for (int index=0; index<n; index++){
            if (arr.get(index) == k){
                return index;
            }
        }
        return -1;
    }
}
