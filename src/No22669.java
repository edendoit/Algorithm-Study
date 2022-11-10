public class No22669 {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;

        for(int i=0; i<str.length()-k+1; i++) {
            String temp = str.substring(i, i+k);
            int n1 = Integer.valueOf(temp);
            if(n1 == 0) {
                continue;
            }
            if(num % n1 == 0) {
                count++;
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/find-the-k-beauty-of-a-number/solutions/2038366/java-easy-solution/?orderBy=most_votes