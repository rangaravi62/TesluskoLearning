package Arrays;

public class MatchingFirstIndex {
    public static void main(String[] args) {
        String text = "ABABABATETRTTTA";
        String pattern = "BABATET";
        System.out.println(findMatchingFirstIndex(text,pattern));
    }

    static int findMatchingFirstIndex(String textIp, String patternIp){

        String text = textIp;
        String pattern = patternIp;
        int textLen = text.length();
        int patternLen = pattern.length();

        for (int i = 0;i < textLen-patternLen; i++) {
            String textSub = text.substring(i,patternLen+i);
            if(textSub.equals(pattern)) {
                return i;
            }
        }
        return -1;
    }
}
