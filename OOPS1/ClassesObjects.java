import java.util.Scanner;

public class  ClassesObjects {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

//        Student[] students = new Student[3];
//        for(int i=0; i<3; i++){
//            students[i] = new Student();
//            students[i].roll_no = inp.nextInt();
//            inp.nextLine();
//            students[i].name = inp.nextLine();
//            students[i].marks = inp.nextFloat();
//        }
//
//        for(int i=0; i<3; i++){
//            System.out.println(students[i].roll_no);
//            System.out.println(students[i].name);
//            System.out.println(students[i].marks);
//        }

        Student std = new Student(18, "Swaraj kakade", 98.45f);
        System.out.println(std.roll_no);
        System.out.println(std.name);
        System.out.println(std.marks);
        std.changeName("pk1");
        std.greetings();

        Student random = new Student();
        System.out.println(random.roll_no);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student random2 = new Student(std);
        System.out.println(random2.roll_no);
        System.out.println(random2.name);
        System.out.println(random2.marks);
    }
}
class Student {
    int roll_no;
    String name;
    float marks;

    // Here it is acting as default values when nothing is passed in constructor
//    Student (){
//        this.roll_no = 1;
//        this.name = "XYZ";
//        this.marks = 66.66f;
//    }

    Student (){
        // Here it is calling constructor from another constructor
        // Internally: new Student(1, "XYZ", 35.55f);
        this (1, "XYZ", 35.55f);
    }

    // Here it is taking values everytime an object of the class is created
    Student (int rollno, String name, float marks){
        this.roll_no = rollno;
        this.name = name;
        this.marks = marks;
    }

    // Here it is taking another object as parameter and then assigning respective values
    Student (Student obj){
        this.roll_no = obj.roll_no;
        this.name = obj.name;
        this.marks = obj.marks;
    }

    void greetings (){
        System.out.printf("Hello %s, you are welcome.", this.name);
        System.out.println();
    }

    void changeName (String name){
        this.name = name;
    }
}