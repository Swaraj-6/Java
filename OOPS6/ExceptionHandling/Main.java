package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws CustomException {
        int a = 5;
        int b = 0;

//        try{
//            int c = divide(a, b);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("This will always execute");
//        }

        int x = 10;
        if (x == 10) {
            try {
                throw new CustomException("Custom exception.");
            } catch (CustomException ce) {
                System.out.println(ce.getMessage());
            }
    }

//    static int divide(int a, int b) throws ArithmeticException{
//        if (b == 0){
//            throw new ArithmeticException("This will not work don't divide by zero");
//        }
//
//        return 0;
    }
}
