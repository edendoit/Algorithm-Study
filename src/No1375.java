public class No1375 {
    public int numTimesAllBlue(int[] flips) {

        int cnt = 0;
        int last = 0;

        int result = 0;
        for(int i : flips) {
            cnt++;
            last = Math.max(last, i);
            if(last == cnt)
                result++;

        }
        return result;
    }
}
