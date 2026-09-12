package DSA.ARRAYS;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 4, 0, 5, 2};
        int[] arr2 = new int[]{1, 0, 0, 1, 3, -2};
        moveZeroesToEnd(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    public static void moveZeroesToEnd(int[] nums) {
        int len  = nums.length;
        int zeroPoint = -1;
        for (int i = 0; i < len; i++) {
            if(nums[i] == 0){
                zeroPoint = i;
                break;
            }
        }

        for (int i = 0; i < len; i++) {
            if(nums[i] == 0){
                i++;
                while (nums[i] !=0){
                    i++;
                    break;
                }
                nums[zeroPoint]  =nums[i];
                zeroPoint = i;
            }
        }
    }
}