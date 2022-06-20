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

    public static void main(String[] args) {
        int[] nums = new int[]{5,4,7,6,1,4};
        maxProfit(nums);
    }

}
