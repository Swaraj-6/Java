import java.math.BigInteger;

public class BigIntegerBasics {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;

        BigInteger A = BigInteger.valueOf(356845454);
        BigInteger B = BigInteger.valueOf(48654);
        BigInteger C = new BigInteger("68563536453461683463541");

        BigInteger S = A.multiply(B);
        System.out.println(S);
        System.out.println(C);
    }
}
