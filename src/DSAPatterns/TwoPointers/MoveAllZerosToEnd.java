package DSAPatterns.TwoPointers;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));


    }

//    TC -> O(N) SC -> O(1)
    public static void moveZerosToEnd(int[] arr) {

        int zeroPoint = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeroPoint = i;
                break;
            }
        }

        if (zeroPoint == -1) return;

        for (int i = zeroPoint+1; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[zeroPoint] = arr[i];
                arr[i] = 0;
                zeroPoint++;
            }
        }

    }
}
