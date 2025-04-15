package Strings;

public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Ravi");
        StringBuilder sb3 = new StringBuilder(100); // this will create a string builder with initial capacity of 100
        System.out.println(sb2.capacity());
    }
}
