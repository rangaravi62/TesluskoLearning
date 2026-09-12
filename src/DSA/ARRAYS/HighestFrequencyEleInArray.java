package DSA.ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyEleInArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 2, 3, 3, 3}; // Ans : 3
        int[] arr2 = new int[]{2, 2, 3, 3}; // If the highest freq elements are multiple then return the smallest element, Ans : 2
        System.out.println(mostFrequentElement(arr2));

    }

    // TC -> O(N) SC -> O(N)
    static int mostFrequentElement(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == maxFreq){
                result = Math.min(entry.getKey(), result);
            }
        }

        return result;
    }
}
