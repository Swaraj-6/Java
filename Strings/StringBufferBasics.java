import java.lang.*;
import java.text.DecimalFormat;

public class StringBufferBasics {
    public static void main(String[] args) {

        // Constructor 1
        StringBuffer sb = new StringBuffer();

        // Constructor 2
//        StringBuffer sb2 = new StringBuffer("Swaraj Kakade");
//
//        //Constructor 3
//        StringBuffer sb3 = new StringBuffer(30);

        sb.append("Swaraj Kakade");
        sb.append(" is nice.");
        System.out.println(sb);
        sb.replace(14, 22, "is good.");
        System.out.println(sb);
        sb.delete(14,22);
        sb.reverse();
        System.out.println(sb);


        StringBuffer sb2 = new StringBuffer("cdfe  rfe    grs   rfssf   rfg   .");
        System.out.println(sb2.toString().replaceAll("\\s+", " "));

        DecimalFormat df = new DecimalFormat("0.0001");
        System.out.println(df.format(7.29));

    }
}
