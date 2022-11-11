public class No2379 {
    public int minimumRecolors(String blocks, int k) {
        int minOps = Integer.MAX_VALUE, flips = 0, count = 0, i = 0;
        for(int j = 0; j < blocks.length(); ++j) {
            if(blocks.charAt(j) == 'W') {
                flips++;
                count++;
            } else if(blocks.charAt(j) == 'B') {
                count++;
            }
            if(count == k) {
                minOps = Math.min(minOps, flips);
                if(blocks.charAt(i) == 'W') {
                    flips--;
                    count--;
                } else count--;
                i++;
            }
        }
        return minOps;
    }

}

// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/solutions/2454833/c-java-python-beginner-friendly-sliding-window/

