package ExceptionHandling_35;

import java.util.Scanner;

public class MultipleCatchBlocks {


    // last catch block is generic catch block
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number :");
            int a = sc.nextInt();
            System.out.print("Enter the second number :");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("The division " + a + " and " + b + " is : " + res);


            System.out.println("The arry length is "+arr.length);
            System.out.print("pick an index :");
            int c = sc.nextInt();
            System.out.println("Enter the element to add");
            int d = sc.nextInt();
            arr[c] = d;
            System.out.println("The element is added");
        } catch (ArithmeticException e) {
            System.out.println("Enter an appropriate input : "+e);
        }catch (NegativeArraySizeException e){
            System.out.println("Enter the index in the range of 0 and "+(arr.length-1) +" : "+e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter the index in the range of 0 and "+(arr.length-1) + "be positive : "+e);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("BYE!");
    }
}
