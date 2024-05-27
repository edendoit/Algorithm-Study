import java.util.*;
public class PMSplitArray {
    public static int[] solution(int n, long left, long right) {
        int len=(int)right-(int)left+1;
        int[] answer = new int[len];

        int idx=0;
        for (long i=left; i<=right; i++) {
            long y = i/n;
            long x = i%n;
            answer[idx++]= (int)Math.max(y, x)+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(3, 2, 5);
    }
}
