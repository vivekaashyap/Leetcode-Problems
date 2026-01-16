
public class _1BestTimeToBuyAndSellStock_121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }
        System.out.println(maxProfit);
    }
}
