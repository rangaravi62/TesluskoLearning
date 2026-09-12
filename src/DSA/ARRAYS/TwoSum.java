package DSA.ARRAYS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] nums = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumOptimal(nums,target)));
    }

    // TC -> O(N^2) SC -> O(1)
    static int[] twoSumBruteForce(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i]+nums[j]) == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // TC -> O(N) SC -> O(N)  -> trading O(N) extra space for reducing the time complexity from O(N²) to O(N)
    static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i= 0;i<nums.length;i++){
            int remNum = target - nums[i];
            if(map.containsKey(remNum)){
                return new int[] {i, map.get(remNum)};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

}
