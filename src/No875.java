import java.util.Arrays;

public class No875 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        while(left <= right) {
            int mid = left + (right-left) /2;
            if(canEat(piles, mid, h)) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return left;
    }

    private boolean canEat(int[] piles, int k, int h) {
        int hours = 0;
        for(int pile:piles) {
            hours += (pile-1)/k+1;
            if(hours > h) {
                return false;
            }
            // int div = pile/k;
            // hours += div;
            // if(pile % k != 0) ++hours;
        }
        // return hours<=h;
        return true;
    }

}
// https://www.youtube.com/watch?v=Sp2sRLcLND0
// https://leetcode.com/problems/koko-eating-bananas/solutions/3270477/easy-solutions-in-java-python-and-c-look-at-once/