package DSA.ARRAYS;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 0, 99, -40};
        System.out.println(largestElement(nums));
    }

    // TC -> O(N) SC -> O(1)
    static int largestElement(int[] nums){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) largest = nums[i];
        }
        return largest;
    }
}
