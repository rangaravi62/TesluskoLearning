package DSA.ARRAYS;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,1};
        System.out.println(containsDuplicateUsingSet(nums));
    }

    // TC -> O(N) SC -> O(N)
    public static boolean containsDuplicateUsingSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    // TC -> O(N*logNr) SC -> O(1)
    public static boolean containsDuplicateUsingSorting(int[] nums) {
       Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}
