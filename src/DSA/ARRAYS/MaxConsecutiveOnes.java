package DSA.ARRAYS;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(maxConsecutiveOnes(nums));
    }

    // TC -> O(N) SC -> O(1)
    static int maxConsecutiveOnes(int[] nums){
        int len = nums.length;

        int onesCount = 0;
        int maxConsecutiveOnes = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) onesCount ++;
            else onesCount = 0;
            maxConsecutiveOnes = Math.max(onesCount,maxConsecutiveOnes);
        }

        return maxConsecutiveOnes;
    }

}
