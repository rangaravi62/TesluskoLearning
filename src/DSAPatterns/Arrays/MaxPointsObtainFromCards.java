package DSAPatterns.Arrays;

public class MaxPointsObtainFromCards {

//    Given N cards arranged in a row, each card has an associated score denoted by the cardScore array.
//
//    Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row.
//
//    The score is the sum of the scores of the chosen cards.
//
//    Return the maximum score that can be obtained.

    public static void main(String[] args) {
        int[] cardScore = new int[]{1, 2, 3, 4, 5, 6};
        int k = 3;
        System.out.println(maxScoreObtainFromCards(cardScore,k));
    }

    // TC -> O(K) SC -> O(1)
    static int maxScoreObtainFromCards(int[] cardScore, int k){
        int maxScore = Integer.MIN_VALUE;
        int sum = 0;
        int len = cardScore.length;
        for (int i = 0; i < k; i++) {
            sum = sum + cardScore[i];
        }
        maxScore = Math.max(maxScore, sum);

        for (int i = 0; i < k; i++) {
            sum = sum - cardScore[k-i-1] + cardScore[len-i-1];
            maxScore = Math.max(maxScore, sum);
        }
        return maxScore;
    }
}
