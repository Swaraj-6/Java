public class StringBasics {
    public static void main(String[] args) {

        String a = "pk1";
        System.out.println(a);
        String b = "pk1";
        System.out.println(b);
        System.out.println(a==b);   // Pointing towards same objects aka. String Pool

        String c = new String("Kakade");
        String d = new String("Kakade");
        System.out.println(c==d);   // Pointing towards different objects, 2 new objects are being created

        // To check whether the two strings are equal or not we can use .equals() method
        System.out.println(c.equals(d));

        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }

    }
}
