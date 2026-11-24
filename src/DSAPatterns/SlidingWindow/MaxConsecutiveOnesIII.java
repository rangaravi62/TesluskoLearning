package DSAPatterns.SlidingWindow;

public class MaxConsecutiveOnesIII {
//    Given a binary array nums and an integer k, flip at most k 0's.
//
//    Return the maximum number of consecutive 1's after performing the flipping operation.


    public static void main(String[] args) {
        int nums[] = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int nums1[] = new int[]{0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(maxConsecutiveOnesAfterFlipping(nums, k));
        System.out.println(maxConsecutiveOnesAfterFlipping(nums1,k));
        System.out.println(maxConsecutiveOnesAfterFlippingOptimal(nums, k));
        System.out.println(maxConsecutiveOnesAfterFlippingOptimal(nums1, k));
    }

    // TC -> O(N^2) SC -> O(1)
    static int maxConsecutiveOnesAfterFlipping(int[] nums, int k) {
        int maxConsecutiveOnes = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int zeros = 0;
            for (int j = i; j < len; j++) {
                if (nums[j] == 0) zeros++;
                if (zeros > k) break;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, j - i + 1);
            }
        }
        return maxConsecutiveOnes;
    }


    static int maxConsecutiveOnesAfterFlippingOptimal(int[] nums, int k) {
        int maxConsecutiveOnes = 0;
        int l = 0;
        int r = 0;
        int len = nums.length;

        int zeros = 0;

        while (r < len) {
            if (nums[r] == 0) zeros++;
            while (zeros > k) {
                if (nums[l] == 0) zeros--;
                l++;
            }
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, r - l + 1);
            r++;
        }
        return maxConsecutiveOnes;
    }

}
