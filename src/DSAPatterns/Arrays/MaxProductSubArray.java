package DSAPatterns.Arrays;

public class MaxProductSubArray {
    // Given an integer array nums, find a subarray that has the largest product, and return the product.
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,-2,4};
        int[] arr1 = new int[] {-2,0,-1};
        System.out.println(maxProductSubarray(arr));
        System.out.println(maxProductSubarrayOptimal(arr));
        System.out.println(maxProductSubarray(arr1));
        System.out.println(maxProductSubarrayOptimal(arr1));
    }

    // TC -> O(N^2) SC -> O(1)
    static int maxProductSubarray(int[] arr){
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product = product * arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }

    // TC -> O(N) SC -> O(1)

//    Intuition :
//    If the array has all positive numbers them product of all the elements will be the answer
//    If the array has even negatives, then also product of all the elements will be the answer
//    If the array has odd positives then entire array traversal will give -ve, so we'll split the array around that
//    -ve number and calculate the positive product starting till that -ve and end till that -ve (backwards)
//    If the array has zero the we make the product 1 so that the zero is not carried

    static int maxProductSubarrayOptimal(int[] arr){
        int maxProduct = Integer.MIN_VALUE;
        int len = arr.length;

        int prefixProduct = 1;
        int suffixProduct = 1;

        for (int i = 0; i < arr.length; i++) {
            if (prefixProduct == 0) prefixProduct = 1;
            if (suffixProduct == 0) suffixProduct = 1;

            prefixProduct = prefixProduct * arr[i];
            suffixProduct = suffixProduct * arr[len - i -1];

            maxProduct = Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));
        }
        return maxProduct;
    }
}
