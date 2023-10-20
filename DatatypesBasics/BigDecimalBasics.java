import java.math.BigDecimal;

public class BigDecimalBasics {
    public static void main(String[] args) {
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");

        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);
    }
}
