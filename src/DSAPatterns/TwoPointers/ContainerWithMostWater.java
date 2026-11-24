package DSAPatterns.TwoPointers;

public class ContainerWithMostWater {

//    You are given an integer array height of length n. There are n vertical lines drawn such
//    that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//    Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//    Return the maximum amount of water a container can store.
    public static void main(String[] args) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        int[] nums1 = new int[]{1,1};
        System.out.println(containerWithMostWaterArea(nums));
        System.out.println(containerWithMostWaterArea(nums1));

        System.out.println(containerWithMostWaterAreaOptimal(nums));
        System.out.println(containerWithMostWaterAreaOptimal(nums1));

    }

    // TC -> O(N^2) SC -> O(1)
    static int containerWithMostWaterArea(int[] nums){
        int maxArea = 0;

        for (int i = 0; i < nums.length; i++) {
            int lh = nums[i]; //left height
            for (int j = i+1; j < nums.length; j++) {
                int rh = nums[j];
                int area = (j-i)*Math.min(lh,rh);
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }

    // TC -> O(N) SC -> O(1)
    static int containerWithMostWaterAreaOptimal(int[] nums){
        int maxArea = 0;

        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int area = (right - left) * Math.min(nums[right], nums[left]);
            maxArea = Math.max(maxArea,area);

            if(nums[left] < nums[right])  {
                left ++;
            } else right --;
        }
        return maxArea;
    }
}
