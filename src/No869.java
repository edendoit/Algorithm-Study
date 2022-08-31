public class No869 {
    public static boolean reorderedPowerOf2(int n) {
        long c = counter(n);
        for (int i = 0; i < 32; i++)
            if (counter(1 << i) == c) return true;
        return false;
    }
    public static long counter(int N) {
        long res = 0;
        for (int i=0; N > 0; i++,N /= 10) {res += (int)Math.pow(10, N % 10);
            System.out.println("Math.pow i = "+i+"   ===> "+ (int)Math.pow(10, N % 10));
            System.out.println("res     i = "+i+"   ===> "+ res);
        }
        return res;
    }
public static void main(String[] args) {
    reorderedPowerOf2(8);
}
}

// https://leetcode.com/problems/reordered-power-of-2/discuss/149843/C%2B%2BJavaPython-Straight-Forward