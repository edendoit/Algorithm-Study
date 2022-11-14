import java.util.HashSet;
import java.util.Set;

public class No202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();

        while(n!=1) {
            if(!set.contains(n))
                set.add(n);
            else
                return false;

            int sum = 0;
            while(n!=0) {
                sum += (n%10) * (n%10);
                n/=10;
            }
            n=sum;
        }
        return true;

    }
}
 // https://leetcode.com/problems/happy-number/solutions/2746059/java-faster-easy-and-elegant-solution/