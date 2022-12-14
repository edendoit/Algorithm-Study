import java.util.Arrays;

public class No121 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        System.out.println("minPrice "+ minPrice);
        int maxPrice = 0;

        for(int i=0; i<prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]-minPrice);
        }
        return maxPrice;
    }

    public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i]<minPrice) {
                minPrice=prices[i];
            } else if(prices[i]-minPrice > maxProfit) {
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,4,7,6,1,4};
        maxProfit(nums);
    }

}
