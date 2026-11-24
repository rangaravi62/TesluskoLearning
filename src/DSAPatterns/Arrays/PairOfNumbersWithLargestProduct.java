package DSAPatterns.Arrays;

import java.net.Inet4Address;
import java.util.Arrays;

public class PairOfNumbersWithLargestProduct {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 6, 7, 0};
        System.out.println(Arrays.toString(maxProductPair(arr)));
        System.out.println(Arrays.toString(maxProductPairOptimal(arr)));

    }

    // TC -> O(N^2) SC -> O(1)
    static int[] maxProductPair(int[] arr){
        int maxProduct = Integer.MIN_VALUE;
        int[] pair = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                }
            }
        }
        return pair;
    }

//    The maximum product pair can come from either:
//    1. The two largest positive numbers.
//    2. The two smallest (most negative) numbers.
    static int[] maxProductPairOptimal(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int num = arr[i];

            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }

            if(num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if(largest*secondLargest > smallest*secondSmallest) return new int[]{largest,secondLargest};
        else return new int[]{smallest,secondSmallest};
    }

}
