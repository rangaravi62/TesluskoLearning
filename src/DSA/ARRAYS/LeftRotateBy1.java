package DSA.ARRAYS;
import java.util.Arrays;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        leftRotateBy1(nums);
        System.out.println(Arrays.toString(nums));
    }

    // TC -> O(N) SC -> O(1)
    static void leftRotateBy1(int[] nums) {
        int firstNum = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = firstNum;
    }
}
