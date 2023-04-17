import java.util.ArrayList;
import java.util.List;

public class No1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> res = new ArrayList<>();
        for(int c : candies) {
            if(c+extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
