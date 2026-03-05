package threads;

public class BankAccount {
    int balence = 1000;
    synchronized void withdraw(int amount) {
        balence -= amount;
    }

    public static void main(String[] args)throws InterruptedException {
        BankAccount acc = new BankAccount();
        Thread t1 = new Thread(() -> acc.withdraw(500));
        Thread t2 = new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Balence:" + acc.balence);
    }
}
/*
Both the threadds t1 and t2 acess and modify the same balence variable
simultaneously. Due to lack of synchronization, the final balence becomes
*shared data causes issues
*Excution order is unpredictable
*leads to data inconsistency
*Need synchronisation to solve the RACE CONDITION
 */
