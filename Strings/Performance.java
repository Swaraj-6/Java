public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i=0; i<26; i++){
            char ch = (char) ('a' + i);
            series += ch;
        }
        // Here it is making a new object everytime as strings are immutable also has the tc of O(n^2)
        System.out.println(series);
    }
}
