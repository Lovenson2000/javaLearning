package leetcode;

/* You are given an array prices where prices[i] is the price 
of a given stock on the ith day. You want to maximize your 
profit by choosing a single day to buy one stock 
and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this 
transaction. If you cannot achieve any profit, return 0.
 */
public class BestDayToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        BestDayToBuyAndSellStock obj = new BestDayToBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = obj.maxProfit(prices);
        System.out.println(maxProfit); // 5
        
    }
}