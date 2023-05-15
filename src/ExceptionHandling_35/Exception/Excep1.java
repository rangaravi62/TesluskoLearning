package ExceptionHandling_35.Exception;

import java.sql.SQLException;
import java.util.Scanner;

public class Excep1 {
    public static void main(String[] args) {
        try {
            beta b = new beta();
            b.disp1();
        }catch (Exception e){
            System.out.println("Catched in main method");
        }
    }
}

class beta{
    public void disp1() throws SQLException {
  alpha a = new alpha();
  a.disp();
}
}
class alpha{
    public void disp() throws SQLException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number :");
            int a = sc.nextInt();
            System.out.print("Enter the second number :");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("The division " + a + " and " + b + " is : " + res);
        }catch (Exception e){
            System.out.println("Catched in alpha class");
            throw e;
        }
    }
}
