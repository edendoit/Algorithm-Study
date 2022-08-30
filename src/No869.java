public class No869 {
    public boolean reorderedPowerOf2(int n) {
        long c = counter(n);
        for (int i = 0; i < 32; i++)
            if (counter(1 << i) == c) return true;
        return false;
    }
    public long counter(int N) {
        long res = 0;
        for (; N > 0; N /= 10) res += (int)Math.pow(10, N % 10);
        return res;
    }
}

// https://leetcode.com/problems/reordered-power-of-2/discuss/149843/C%2B%2BJavaPython-Straight-Forward