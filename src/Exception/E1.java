package Exception;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[9]);
        // catch (ArithmeticException e) {
           // System.out.println("Cannot divided by 0");
            //e.printStackTrace();

        //} catch (ArrayIndexOutOfBoundsException e) {
          //  System.out.println("Invalid index array:" + k);
        } catch (Exception e) {
            System.out.println("Somthing happened:");

        }finally {

            System.out.println("Start Execution");
            System.out.println("Load DB");
            System.out.println("Load Internet");
            System.out.println("Load files");
            System.out.println("Somthing");



        }
    }
}
