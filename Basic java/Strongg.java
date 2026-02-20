import java.util.*;

public class Strongg {
    int factorial(int d) {
        int fact=1;
        for(int i=1;i<=d;i++) {
            fact=fact*i;
        }
        return fact;
    }
    boolean isStrongg(int n) {
        int temp=n;
        int sum=0;
        while(n!=0) {
            int d=n%10;
            sum=sum+factorial(d);
            n=n/10;
        }
        if(sum==temp) {
            return true;
        }
        return false;
    }
        
    
    }
    public static void main(String[] args) {
        Strongg ob=new Strongg();
        Scanner ob1=new Scanner(System.in);
        System.out.println("Enter a number:");
        if(ob.isStrongg(145)) {
            System.out.println("It is a strong number");
        }
        else {
            System.out.println("It is not a strong number");
        }
    }
    
    

