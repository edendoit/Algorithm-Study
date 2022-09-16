import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No1331 {
    public int[] arrayRankTransform(int[] arr) {
        int [] res = Arrays.copyOf(arr, arr.length);
        Arrays.sort(res);
        Map<Integer, Integer> rank = new HashMap<>();
        for(int x : res)
            rank.putIfAbsent(x, rank.size()+1);
        for(int i=0; i<arr.length; ++i)
            res[i] = rank.get(arr[i]);
        return res;
    }
}

// https://leetcode.com/problems/rank-transform-of-an-array/discuss/489753/JavaC%2B%2BPython-HashMap