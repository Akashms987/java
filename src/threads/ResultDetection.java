package threads;

public class ResultDetection {
    synchronized void declareResult() throws Exception {
        System.out.println("Waiting for approval...");
        wait();
        System.out.println("Result Detected");

    }
    synchronized void approve() {
        notify();
    }

    public static void main(String[] args)throws Exception {
      ResultDetection rd = new ResultDetection();
      new Thread(
              () -> {
                  try {
                      rd.declareResult();
                  }catch (Exception e){}

              }).start();
      Thread.sleep(3000);
      new Thread(() ->
              rd.approve()).start();
    }
}
/*
The declareresult() method waits until another  thread ccalls
notify(). During wait(), the method releases the lock, allowing
other threads to enter the sychronized code.
*sleep() -> time based
*wait() -> condition based
*wait() -> release look ->by checking the notify() method
*wait() -> is used in inter-threaded communicatoin
Order-placed -> preparing -> prepared -> Delivering - Delivered
 */