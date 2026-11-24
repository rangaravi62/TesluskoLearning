package DSAPatterns.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len -i -1];
            arr[len-i-1] = temp;
        }
    }
}
