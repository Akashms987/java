package Exception;

public class ThrowableDemo {
    static void test() throws Throwable {
        throw new Throwable("Somthing went wrong");
    }

    public static void main(String[] args) {
        try {

        }catch (Throwable t) {
            //fully qualified name+message
            System.out.println("Handled:" +t);
            //only the message
            System.out.println("Handled:" +t.getMessage());
        }
    }
}
