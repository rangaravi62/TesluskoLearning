package Strings;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Ravi";
        String s2 = "Ravi";
        System.out.println(s1 == s2); // true, because both refer to the same string literal in the string pool

        String s3 = new String("Ravi");
        System.out.println(s1 == s3); // false, String created with new keyword will be stored in heap area, s1 in string pool and s3 in heap, reference is different
        System.out.println(s1.equals(s3)); // true, because equals() method compares the content of the strings
        String s4 = new String("Ravi");
        System.out.println(s3 == s4); // false, because both are different objects in heap

        String s5 = "ravi";
        System.out.println(s1.compareTo(s5)); // -ve value, because s1 is lexicographically less than s5
    }
}
