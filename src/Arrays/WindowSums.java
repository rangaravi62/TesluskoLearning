package Arrays;

import java.util.Arrays;

public class WindowSums {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(windowSums2(new int[]{1, 2, 3, 4, 5},3)));
    }

    public static int[] windowSums(int[] arr, int k) {
        int out[] = new int[arr.length];
        int sum = 0;
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i>k-1){
                sum = sum + arr[i] - arr[j];
                j++;
            }else {
                sum = sum + arr[i];
            }
            out[i] =sum;
        }
        return out;
    }

    public static int[] windowSums1(int[] arr, int k) {
        int out[] = new int[arr.length];
        int j =0;
        out[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(i>k-1){
                out[i] = out[i-1] + arr[i] - arr[j];
                j++;
            }else {
                out[i] = out[i-1] + arr[i];
            }
        }
        return out;
    }

    public static int[] windowSums2(int[] arr, int k) {
        int out[] = new int[arr.length];
        out[0] = arr[0];
        for (int i = 1; i < k; i++)
            out[i] = out[i-1] + arr[i];
        for (int i = k; i < arr.length; i++)
            out[i] = out[i-1] + arr[i] - arr[i - k];
        return out;
    }

}
