import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

        Scanner inp = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            list.add(i);
        }
        System.out.println(list);
        list.set(0, 10);
        list.remove(4);
        System.out.println(list);

        for(int i=0; i<list.toArray().length; i++){
            System.out.println(list.get(i));
        }

    }
}
