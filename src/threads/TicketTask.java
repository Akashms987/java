package threads;

public class TicketTask implements Runnable {
    String task;
    TicketTask(String task) {
        this.task = task;
    }
    public void run() {
        System.out.println(task + "in progress.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketTask("Seat Assignment"));

        Thread t2 = new Thread(new TicketTask("Payment processing"));

        Thread t3 = new Thread(new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }

}
/*
Each runnable Object is a job, and the Thread class is
resposible only for excution, which make this approach
clear and more flexible
*implements Runnable
*Better Design
Interviewers mostly task thiis
*Supports multiple inhertance via interfaces
 */