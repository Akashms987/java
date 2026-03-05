package threads;

public class ATMTransaction extends Thread{
    public void run() {
        System.out.println("Procesing Atm transaction");

    }

    public static void main(String[] args) {
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread State:" + t.getState());
        t.start();
        System.out.println("Thread state after start" +t.getState());
    }
}
/*
Initially th thread is in th NEW state. After calling start(),
it moves to RUNNABLE and excutes the run() method.
The exact timing of the state changes depends on the
JVM Scheduler
*Thread is created once
*start() changes state
*Thread cannot be restarted
*Final state is TERMINATED or DEAD
 */