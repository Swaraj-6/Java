package Generics;

public class CustomArrayListGeneric<T> {
    private Object[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayListGeneric(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
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
        Object[] temp = new Object[data.length * 2];
        for (int i=0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(int idx){
        T removed = (T)(data[size-1]);
        size--;
        return removed;
    }

    public T get(int idx){
        return (T)(data[idx]);
    }

    public int size(){
        return size;
    }

    public void set(int idx, T value){
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
        CustomArrayListGeneric<Integer> list = new CustomArrayListGeneric<>();

        for(int i=1; i<15; i++){
            list.add(2*i);
        }

        CustomArrayListGeneric<String> list2 = new CustomArrayListGeneric<>();
        for(int i=0; i<15; i++){
            list2.add("A"+ i);
        }

        System.out.println(list);
        System.out.println(list2);
    }
}
