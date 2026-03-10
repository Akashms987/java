package Collection_base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateAnArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6,6,7,8};
        System.out.println(Arrays.toString(arr));
        Set<Integer> uniqueElemets = new HashSet<>();
        for (int x : arr) {
            uniqueElemets.add(x);
        }
        System.out.println(uniqueElemets);
    }
}
