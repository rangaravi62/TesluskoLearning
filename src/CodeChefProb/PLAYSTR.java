package CodeChefProb;

import java.util.Scanner;

public class PLAYSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            String R = sc.nextLine();
            System.out.println(SandREqual(S,R));
        }
    }

    public static String SandREqual(String s, String r) {
        int s1 = 0;
        int r1 = 0;
        if (s.length() != r.length()) return "NO";
        else {
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i) == '1'){
                    s1++;
                }
                if(r.charAt(i) == '1'){
                    r1++;
                }
            }
        }
        return (s1 == r1) ? "YES" : "NO";
    }

}
