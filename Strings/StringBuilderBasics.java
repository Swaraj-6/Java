public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<26; i++){
            char ch = (char) ('a' + i);
            str.append(ch);     // Here same object is getting modified
        }
        System.out.println(str);
        StringBuilder str2 = new StringBuilder("Swaraj Kakade");
        System.out.println(str2);
    }
}
