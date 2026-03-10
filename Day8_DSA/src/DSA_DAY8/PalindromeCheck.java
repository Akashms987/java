package DSA_DAY8;

public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "malayalam";
        StringBuilder s1 = new StringBuilder("malayalam");
        s1.reverse();
        if(original.equals(s1)){
            System.out.println("palindromee");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
