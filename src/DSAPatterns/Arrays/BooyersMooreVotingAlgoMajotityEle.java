package DSAPatterns.Arrays;

import java.util.HashMap;
import java.util.Map;

public class BooyersMooreVotingAlgoMajotityEle {

    // Majority Element is the element which appears more than n / 2 times in an array of length n.
    public static void main(String[] args) {
        int[] arr = new int[] {2, 2, 1, 1, 2, 2, 2};
        System.out.println(majorityElementBruteForce(arr));
        System.out.println(majorityElementBetterSol(arr));
        System.out.println(majorityElementOptimal(arr));
    }

    // TC -> O(N^2) SC -> O(1)
    static int majorityElementBruteForce(int[] arr){
        int len  = arr.length;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j]) count++;
                if(count > len/2) return arr[i];
            }
        }
        return -1;
    }

    // TC -> O(N) SC -> O(N)
    static int majorityElementBetterSol(int[] arr) {
        int len = arr.length;;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > len/2) return key;
        }

        return -1;
    }

    // TC -> O(N) SC -> O(1)
    static int majorityElementOptimal(int[] arr){

        int ele = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(count == 0){
                ele = arr[i];
                count++;
                continue;
            }

            if(arr[i] == ele) count++;
            else count--;
        }

        return ele;
    }
}
