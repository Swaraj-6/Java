public class Basics_conditions {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if (boolean expression T or F) {
                // body
            } else {
                // do this
            }
        */
        int salary = 250685;
        if (salary < 10000){
            salary += 250000;
        } else if (salary == 250685) {
            salary = 0;
        } else{
            salary -= 250000;
        }
        System.out.println(salary);
    }
}
