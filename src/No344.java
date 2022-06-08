public class No344 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = (s.length - 1);
        //char[] result = new char[s.length];
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start ++;
            end --;

        }


    }

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }


}
