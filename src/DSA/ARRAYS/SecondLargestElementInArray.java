package DSA.ARRAYS;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 8, 7, 6, 5};
        System.out.println(secondLargestElement(nums));
    }

    // TC -> O(N) SC -> O(1)
    static int secondLargestElement(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            } else if(nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}
