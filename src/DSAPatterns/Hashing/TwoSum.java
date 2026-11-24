package DSAPatterns.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumBrute(arr,target)));
        System.out.println(Arrays.toString(twoSumOptimal(arr,target)));

    }

    // TC -> O(N^2), SC -> O(1)
    public static int[] twoSumBrute(int[] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    // TC -> O(N), SC -> O(N)
    public static int[] twoSumOptimal(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int remValue = target - arr[i];
            if(map.containsKey(remValue)) {
                return new int[]{map.get(remValue),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }


}
