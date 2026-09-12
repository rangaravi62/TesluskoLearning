package DSA.ARRAYS;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(sumOfElements(nums));
    }

    // TC -> O(N) SC -> O(1)
    static int sumOfElements(int[] nums){
        int sum = 0 ;
        for (int i = 0; i < nums.length; i++) sum = sum + nums[i];

        return sum;
    }
}
