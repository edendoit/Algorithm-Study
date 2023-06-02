public class No604 {
    class StringIterator {
        String s;
        Character cur= ' ';
        int index=0, cnt=0;
        public StringIterator(String compressedString) {
            this.s = compressedString;

        }

        public char next() {
            if(cnt == 0) {
                if(index>=s.length()) return ' ';
                cur = s.charAt(index++);
                while(index < s.length() && s.charAt(index) >= '0' && s.charAt(index)<='9') {
                    cnt = 10 * cnt+(s.charAt(index)-'0');
                    index++;
                }
            }
            cnt --;
            return cur;
        }

        public boolean hasNext() {
            return index < s.length() || cnt != 0;
        }
    }
}
// https://leetcode.com/problems/design-compressed-string-iterator/solutions/103872/straightforward-java-solution-no-fancy-data-structure/?envType=study-plan-v2&envId=premium-algo-100