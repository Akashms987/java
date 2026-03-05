package arrays;

public class E1 {
    public static void main(String[] args) {
        //Method1
        int[] arr1;
        arr1 =  new int [5];//memory Allocatioon [20bytes]
        //Declaration + Memory Allocation in single line
        //if we don't provide value
        //the JVM uses "Fallback Mechanism"
        //it uses the default value of tha TAHT  data type

        //Method2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        System.out.println(arr1[3]);
        //Mehtod 3
        int[] arr3 = {1,2,3,4,5};
        //Method 4
        int[] arr4 = new int[]{2,4,6,8,10};
    }
}
