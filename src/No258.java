public class No258 {
    public int addDigits(int num) {
        int div = 0;

        while(num > 0) {
            div += num % 10;
            num /= 10;

            // still div >= 10
            if(num == 0 && div > 9) {
                num = div;
                div = 0;
            }
        }
        return div;

    }
}
// https://leetcode.com/problems/add-digits/editorial/