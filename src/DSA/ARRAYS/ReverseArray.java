package DSA.ARRAYS;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        reverseAnArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    // TC -> O(N/2) == O(N) SC -> O(1)
    static void reverseAnArray(int[] nums){
        int len = nums.length;;
        for (int i = 0; i < len/2; i++) {
            int num = nums[len - i -1];
            nums[len - i -1] = nums[i];
            nums[i] = num;
        }
    }
}
