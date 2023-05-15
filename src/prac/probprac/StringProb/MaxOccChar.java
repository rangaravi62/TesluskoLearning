package prac.probprac.StringProb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = "ravitejak";
        str = str.replace(" ","").toLowerCase();
        int len  = str.length();
        Character arr[] = new Character[127];
        Arrays.fill(arr, 0);
        for (int i = 0; i < len; i++) {
            int j = (int)str.charAt(i);
            arr[j]++;
        }
//        Map<Character,Integer> map = new HashMap<>();
//        for (Integer i = 96; i < arr.length; i++) {
//            char j = Character.highSurrogate(i);
//            map.put( j, Integer.valueOf(arr[i]));
//        }
//        System.out.println(map);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

    }
}
