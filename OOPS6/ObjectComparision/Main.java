package ObjectComparision;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.85f);
        Student rahul = new Student(5, 99.85f);

        if (kunal.compareTo(rahul) == 0){
            System.out.println("Both are equal");
        } else if (kunal.compareTo(rahul) > 0) {
            System.out.println("Kunal scored more");
        }else {
            System.out.println("Rahul scored more");
        }
    }
}
