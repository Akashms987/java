package Exception;

public class E3 {
    static void checkAge(int Age){
        if(Age >= 18) {
            System.out.println("Eligible-Acces Granted");
        }else {
            throw new RuntimeException("Not eligible Acces Denoed");
        }
    }

    public static void main(String[] args) {
        checkAge(18);
    }
}
