package prac.probprac;

public class TransposeOfAMatrix {

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3,4},{4,5,6},{7,8,9}};
        int len = arr.length;
        int tranArr[][] = new int[len][len];
        for (int i=0;i<len;i++){
            for (int j = 0;j<len;j++){
                tranArr[i][j] = ( i==j)? arr[i][j] : arr[j][i];
                }
            }


        for (int i=0;i< tranArr.length;i++){
            for (int j = 0;j< tranArr.length;j++){
                System.out.print(tranArr[i][j]+" ");
            }
            System.out.println();
        }


        }
    }

