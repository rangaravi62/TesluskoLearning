package DSA.ARRAYS;

import java.util.Arrays;

import static DSA.ARRAYS.LeftRotateBy1.leftRotateBy1;

public class LeftRotateByKPlaces {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        leftRotateByk(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    // TC -> O(N*K) SC -> O(1)
    private static void leftRotateByk(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        for (int i = 0; i < k; i++) {
            leftRotateBy1(nums);
        }
    }

    // TC -> O(N) SC -> O(1) TODO
    private static void leftRotateBykOptimal(int[] nums, int k) {

    }
}
