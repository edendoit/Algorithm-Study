public class No309 {
    public int maxProfit(int[] prices) {
        int sold = Integer.MIN_VALUE, hold = Integer.MIN_VALUE, reset=0;

        for(int price : prices) {
            int preSold = sold;

            sold = hold+price;
            hold = Math.max(hold, reset-price);
            reset = Math.max(reset, preSold);
        }
        return Math.max(sold, reset);
    }
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
