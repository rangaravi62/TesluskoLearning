package DSA.ARRAYS;

public class CountOddNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(countOddNumbers(nums));
    }

    // TC -> O(N) SC -> O(1)
    static int countOddNumbers(int[] arr){
        int oddNumCount = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & 1) == 1) oddNumCount ++;
        }

        return oddNumCount;
    }
}
