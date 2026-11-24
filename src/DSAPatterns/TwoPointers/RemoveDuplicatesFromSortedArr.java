package DSAPatterns.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArr {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        System.out.println("Unique Elements -> "+remDuplicates(arr));
    }

    // TC -> O(N), SC -> O(1)
    public static int remDuplicates(int[] arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return j+1;
    }
}
