package DSA_DAY8;
import java.util.Arrays;
public class MergeTwoSortArrays {
    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9};
        int[] array2 = {2,4,5,6};
        int[] merged = mergedTwoSortedArrays(array1,array2);
        System.out.println("Merged Array: " + Arrays.toString(merged));

    }

    private static int[] mergedTwoSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }
            while (j < n2) {
                merged[k++] = array2[j++];

            }
            return merged;
        }
    }

