package InnerClass;

public class BankAccount {
    private double balence=10000;
    //member Inner Class
    class Transaction{
        void withdraw(double amount) {
            if (amount <=  balence) {
                balence -= amount;
                System.out.println("Withdraw:" + amount);

            }else {
                System.out.println("Insufficient Funds:");
            }
        }

    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        //Outer.Inner in_object = out_object.new Inner();
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        //System.out.println("Balence" +account.balence);
        System.out.println(account.balence);
    }

}
/*
*Transaction belongs to specific account
* *Direct acess to private variable balance
* Clean encapsulation
 */