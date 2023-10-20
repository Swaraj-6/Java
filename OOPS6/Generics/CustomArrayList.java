package Generics;
import java.util.*;
public class CustomArrayList {
    private int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        for (int i=0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(int idx){
        int removed = data[size-1];
        size--;
        return removed;
    }

    public int get(int idx){
        return data[idx];
    }

    public int size(){
        return size;
    }

    public void set(int idx, int value){
        data[idx] = value;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i=0; i<size; i++){
            str.append(data[i]);
            if (i != size-1){
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        for (int i=1; i<15; i++){
            list.add(2*i);
        }

        System.out.println(list);
    }
}
