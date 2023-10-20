package ObjectComparision;

public class Student implements Comparable<Student>{
    int roll_no;
    float marks;

    public Student(int roll_no, float marks){
        this.roll_no = roll_no;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student obj) {
        int diff = (int)(this.marks - obj.marks);
        // If diff == 0 then both objects have same marks
        // Tf diff > 0 then this.marks is greater
        // Tf diff < 0 then obj.marks is greater
        return diff;
    }
}
