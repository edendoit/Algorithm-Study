public class No1328 {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n == 1) return "";

        int half = n / 2;
        char[] parray = palindrome.toCharArray();
        for(int i=0; i<half; i++) {
            if(parray[i] != 'a') {
                parray[i] = 'a';
                return new String(parray);
            }
        }

        parray[palindrome.length()-1] = 'b';

        return new String(parray);
    }
}

//https://www.youtube.com/watch?v=UwaoswYb5bk