public class No345 {
    public static String reverseVowels(String s) {
        String[] ch = new String[s.length()];
        int left = 0;
        int right = s.length()-1;
        String vowels="aeiouAEIOU";
        while(left<=right) {
            String a = Character.toString(s.charAt(left));
            String b = Character.toString(s.charAt(right));

            if(vowels.contains(a) && vowels.contains(b)) {
                ch[left]=b;
                ch[right]=a;
                left++; right--;
            }
            if(!vowels.contains(a)) {
                ch[left]=a;
                left++;
            } if(!vowels.contains(b)) {
                ch[right]=b;
                right--;
            }
        }
        String res="";
        for(int i=0; i<ch.length; i++) {
            res+=ch[i];
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        reverseVowels("leetcode");
    }
}
