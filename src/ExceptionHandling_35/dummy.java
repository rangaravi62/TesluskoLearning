package ExceptionHandling_35;

import java.math.BigInteger;
import java.util.Map;

class Solution {
    static Map<Character,Integer> map = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));

    }
    public static String convertToTitle(int columnNumber) {
        String res="";
        int ascii = 64;
        while(columnNumber>0){
            int rem = columnNumber % 26;
            if( rem == 0){
                res = (char)(26 +ascii) + res;
                columnNumber = columnNumber/26 -1;
            }else{
                res = (char)(rem + ascii) + res;
                columnNumber = columnNumber/26;
            }
        }
        return res;
    }

}