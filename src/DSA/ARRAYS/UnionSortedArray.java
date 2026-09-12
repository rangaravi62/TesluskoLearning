package DSA.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnionSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = new int[]{1, 2, 7};
        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();
        while(i< len1 && j<len2){
            if(nums1[i] <= nums2[j]) {
                if (list.isEmpty() || list.get(list.size()-1) != nums1[i]) {
                    list.add(nums1[i]);
                    i++;
                }else {
                    i++;
                    j++;
                }
            } else {
                if(list.isEmpty() || list.get(list.size()-1) != nums2[j]){
                    list.add(nums2[j]);
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
        }

        while (i< len1){
            if (list.isEmpty() || list.get(list.size()-1) != nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }

        while (j< len2){
            if (list.isEmpty() || list.get(list.size()-1) != nums2[j]) {
                list.add(nums2[j]);
            }
            j++;
        }

        return list.stream().mapToInt(v -> v).toArray();
   }
}



