import java.util.*;

public class Neon {

    public static boolean check(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            int d = square % 10;
            sum = sum + d;
            square = square / 10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (check(n)) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not Neon number");
        }

        sc.close();
    }
}
