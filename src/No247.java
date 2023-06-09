import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No247 {
    public List<String> findStrobogrammatic(int n) {
        return numdef(n, n);
    }
    public List<String> numdef(int n, int length) {
        List<String> res = new ArrayList<>();
        if(n == 0) return new ArrayList<String>(Arrays.asList(""));
        if(n == 1) return new ArrayList<String>(Arrays.asList("0","1","8"));


        List<String> mid = numdef(n-2, length);
        for(String middle : mid) {
            if(n!=length) res.add("0"+middle+"0");

            res.add("8"+middle+"8");
            res.add("1"+middle+"1");
            res.add("6"+middle+"9");
            res.add("9"+middle+"6");
        }
        return res;
    }
}
// https://www.geeksforgeeks.org/strobogrammatic-number/