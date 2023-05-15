package prac.probprac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SelectionSort {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        System.out.println(map.size());
        int arr[] = {66,33,44,22,66,11};
        int n =arr.length;
        for (int i=0;i<arr.length-1;i++){
            for (int j =0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
            n--;
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i+" , "));
    }
}
