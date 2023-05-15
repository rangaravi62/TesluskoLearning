package ExceptionHandling_35.Exception;

import java.util.Scanner;

public class OutofboundsANDnegatieindex {

    //ArrayOutOfBounds , OutofboundsANDnegatieindex exceptions

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[] = {1,2,3,4,5};

        System.out.println("The arry length is "+arr.length);
        System.out.print("pick an index :");
        int a = sc.nextInt();
        int res = arr[a];
        System.out.println("The element is : "+res);
    }
}
