package Patterns;

public class BasicPatterns {
    public static void main(String[] args) {
        R2AngledLowerTriangle(5);
    }

    public static void main(char[] args) {
        R2AngledUpperTriangle(5);
    }



    public static void squarePat(int rows){
        for (int i=1;i<=rows;i++){
            for (int j = 1; j <= rows ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void R2AngledUpperTriangle(int col){
        int n = 5; // no of rows
        for (int i=1;i<=col;i++){
            for (int j = 1; j <= n+i-col ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void R2AngledLowerTriangle(int col) {
        int n = 5; // no of rows
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
