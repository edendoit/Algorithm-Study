import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No279 {
    public int numSquares(int n) {
        List<Integer> square_nums = new ArrayList<>();

        for(int i=1; i*i<=n; i++) {
            square_nums.add(i*i);
        }
        Set<Integer> queue = new HashSet<>();
        queue.add(n);

        int lv=0;
        while(queue.size()>0) {
            lv++;
            Set<Integer> nextQueue = new HashSet<>();

            for(Integer remainder : queue) {
                for(Integer square : square_nums) {
                    if(remainder.equals(square)) {
                        return lv;
                    } else if(remainder < square) {
                        break;
                    } else {
                        nextQueue.add(remainder-square);
                    }
                }
            }
            queue = nextQueue;
        }
        return lv;
    }
    // https://leetcode.com/problems/perfect-squares/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
