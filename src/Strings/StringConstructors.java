package Strings;

public class StringConstructors {
    public static void main(String[] args) {
        String s1 = new String("Ravi");
        String s2 = new String(new char[]{'R', 'a', 'v', 'i'});
        String s3 = new String(new byte[]{65, 66, 67});
        String s4 = new String(new StringBuffer("Ravi"));
        String s5 = new String(new StringBuilder("Ravi"));
        System.out.println(s2); // Ravi
        System.out.println(s2 == s4); // false, because both are different objects in heap
    }
}
