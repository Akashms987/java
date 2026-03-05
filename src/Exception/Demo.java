package Exception;

public class Demo {
    public static void main(String[] args) {
        try {
            int balence = 2000;
            int withdraw = 3000;
            if(withdraw > balence) {

                throw new ArithmeticException("Insufficient Funds");

            }
            System.out.println("Withdraw Succesful");

        }catch(ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
