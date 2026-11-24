package DSAPatterns.Arrays;

public class BestTimeToBuyAndSellStock {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        int[] prices2 = new int[] {7,6,4,3,1};
        System.out.println(bestTimeBuyAndSellBruteForce(prices2));
        System.out.println(bestTimeBuyAndSellBruteForce(prices2));

    }

    // TC -> O(N^2) SC -> O(1)
    static int bestTimeBuyAndSellBruteForce(int[] prices) {

        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int sellingPrice = prices[j] -prices[i];
                maxProfit = Math.max(maxProfit,sellingPrice);
            }
        }
        if(maxProfit <=0) return 0;
        return maxProfit;
    }

    // TC -> O(N) SC -> O(1)
    static int bestTimeBuyAndSellOptimal(int[] prices){
        int maxProfit = Integer.MIN_VALUE;

        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minVal) {
                minVal = prices[i];
                continue;
            }
            int sellingPrice = prices[i] - minVal;
            maxProfit = Math.max(maxProfit,sellingPrice);
        }
        if(maxProfit <=0) return 0;
        return maxProfit;
    }
}
