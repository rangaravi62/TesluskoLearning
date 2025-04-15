package Strings;

public class StringTest2 {
    public static void main(String[] args) {
        String s = new String("Ranga");
        s.concat("Ravi");
        s = s.concat("Teja");
        System.out.println(s); // RangaTeja -> scp : "Ranga" , "Ravi" , "Teja"  - heap : "RangaTeja" , remaining two "Ranga" and "RangaRavi" are eligible for gc (garbage collection).


        final String s1 = "Telusko";
        String s2 = "Ineuron";
        String s3 = "Telusko"+"Ineuron"; // for constants concatenation is done at compile time
        String s4 = s1+s2;  // even though we're not using new keyword here, if there are references (s1,s2), it will be done at runtime, so it'll be stored in heap
        String s5 = s1 + "Ineuron";
        System.out.println(s4 == s5); // false, because both refer to the diff obj in heap
        // scp -> "Telusko", "Ineuron", "TeluskoIneuron" - heap -> "TeluskoIneuron" , "TeluskoIneuron"

        final String s6 = s1+"Ineuron"; // Here s1 is final , so the concatenation is done at compile time, this will be stored in scp.
        System.out.println(s3 == s6); // true, because both refer to the same string literal in the string pool


    }
}
