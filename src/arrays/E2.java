package arrays;

public class E2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1] =40;
        System.out.println(arr[1]);
        //Acess and update elements in an array -> TC 0(1)
        //this is because of index -based acess or
        //direct index-mapping
        //[idx = pos-1] or [pos = idx + 1]
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for(int x  : arr ){
            System.out.print(x + " ");

        }
        System.out.println();
        for(Object o : arr)  {
            System.out.print(o + " ");
        }
        System.out.println();
        String name = "JAVA";
        System.out.println(name.length());
    }
}
/*
*array.length is a property
*String.length() is a method
* memory management:
* Array Object is stored in the Heap
* varible reference is stored in the stack
* Elements are stored in contiguousblocks
* char[1][1][1][1] int[4][4][4][4][4] double[8][8][8][8] bytes
 */