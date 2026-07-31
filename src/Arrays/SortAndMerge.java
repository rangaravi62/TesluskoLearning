package Arrays;

public class SortAndMerge {

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 1, 2, 3};
        int arr2[] = new int[]{2, 4, 6};


        int len1 = arr1.length;
        int len2 = arr2.length;

        int arr3[] = new int[len1 + len2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < len1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < len2){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        java.util.Arrays.toString(arr3);
    }
}
