package in.kumarrahul.leetcode.blind75;

public class MaxProfitStockL121 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int left = 0, right = 1; //left = buying, right = selling
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
