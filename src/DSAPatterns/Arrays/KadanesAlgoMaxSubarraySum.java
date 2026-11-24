package DSAPatterns.Arrays;

public class KadanesAlgoMaxSubarraySum {

    //find the maximum sum of any contiguous subarray.
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr));
        System.out.println(maxSubarraySumKadanesAlgoOptimal(arr));

    }

    // TC -> O(N^2) SC -> O(1)
    static int maxSubarraySum(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // TC -> O(N) SC -> O(1)
    static int maxSubarraySumKadanesAlgoOptimal(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum < 0) sum = 0;

            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
