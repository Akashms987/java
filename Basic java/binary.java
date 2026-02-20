import java.util.*;
public class binary {
    public static int no_bits(int n) {
        int count=0;
        while(n!=0) {
            if((n&1)==1) {
            count++;
            }
            n=n>>1;
        }
        return count;
        }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=ob.nextInt();
        int result=no_bits(n);
        System.out.println("Number of bits required to represent "+n+" in binary is: "+result);
    }
}


    
