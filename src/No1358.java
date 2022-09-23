public class No1358 {
    public int numberOfSubstrings(String s) {
        int n = s.length();

        int result = 0;
        int[] lastPos = {-1, -1, -1};
        for(int i=0; i<n; i++) {
            lastPos[s.charAt(i)-'a'] = i;
            result += Math.min(lastPos[0], Math.min(lastPos[1], lastPos[2])) + 1;
        }
        return result;
    }
}
//https://www.youtube.com/watch?v=efAEJ-z6Fww
