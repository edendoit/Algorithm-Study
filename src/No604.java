public class No604 {
    class StringIterator {
        String compressedString;
        Character cur= ' ';
        int index=0, cnt=0;
        public StringIterator(String compressedString) {
            this.compressedString = compressedString;

        }

        public char next() {
            if(cnt == 0) {
                if(index>=compressedString.length()) return ' ';
                cur = compressedString.charAt(index++);
                while(index < compressedString.length() && compressedString.charAt(index) >= '0' && compressedString.charAt(index)<='9') {
                    cnt = 10 * cnt+(compressedString.charAt(index)-'0');
                    index++;
                }
            }
            cnt --;
            return cur;
        }

        public boolean hasNext() {
            return index < compressedString.length() || cnt != 0;
        }
    }
}
// https://leetcode.com/problems/design-compressed-string-iterator/solutions/103872/straightforward-java-solution-no-fancy-data-structure/?envType=study-plan-v2&envId=premium-algo-100