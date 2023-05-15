package ExceptionHandling_35.Exception;

import java.util.Scanner;

public class Arithmeticexception {
    //if we give b as 0 it will result in Arithmetic Exception

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();
        int res = a/b;
        System.out.println("The division "+a+" and "+b+" is : "+res);

    }
}
