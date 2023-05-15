package ExceptionHandling_35.Exception;

import java.util.Scanner;

public class handlingException {

    // to handle Exceptions add try-catch blocks where you feel the statements  may be risky
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number :");
            int a = sc.nextInt();
            System.out.print("Enter the second number :");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("The division " + a + " and " + b + " is : " + res);
            System.out.println("Division works fine ");
        }catch (Exception e){
            System.out.println("Division doesn't work fine :"+ e);
        }
        System.out.println("BYE !");
    }
}
