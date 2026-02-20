import java.util.Scanner;
class HappyNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s12c = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n= sc.nextInt();
        int temp = n;
        while (temp!= 1 && temp !=4) {
            int sum = 0;
            while (temp>0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;

    
            }
            temp = sum;
        }
        if (temp == 1) {
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
    }

}