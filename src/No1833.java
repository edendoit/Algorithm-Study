import java.util.Arrays;

public class No1833 {
    public int maxIceCream(int[] costs, int coins) {
        if(costs.length==1 && costs[0] > coins) return 0;

        Arrays.sort(costs);
        int count = 0;


        for(int i=0; i<costs.length; i++) {
            if (costs[i] < coins) {
                coins -= costs[i];
                count++;
            } else if (costs[i] == coins) {
                count++;
                return count;
            } else if (costs[i] > coins) {
                return count;
            }
        }

        return count;
    }
}
