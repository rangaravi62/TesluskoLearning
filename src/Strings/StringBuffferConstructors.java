package Strings;

public class StringBuffferConstructors {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Ravi");
        StringBuffer sb3 = new StringBuffer(100); // this will create a string buffer with initial capacity of 100
        System.out.println(sb2.capacity());
    }
}
