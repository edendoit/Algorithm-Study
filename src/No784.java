import java.util.ArrayList;
import java.util.List;

public class No784 {
    public List<String> letterCasePermutation(String s) {
        char[] arr = s.toCharArray();
        List<String> res = new ArrayList<>();

        backtrack(arr, res, 0);
        return res;
    }


    public void backtrack(char[] arr, List<String> res, int idx) {
        if(idx == arr.length) {
            res.add(new String(arr));
        } else {
            char c = arr[idx];
            if(isAlpha(c)) {
                arr[idx] = Character.toLowerCase(c);
                backtrack(arr, res, idx+1);
                arr[idx] = Character.toUpperCase(c);
                backtrack(arr, res, idx+1);
            }else {
                backtrack(arr, res, idx+1);
            }
        }
    }
    public boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
// https://www.youtube.com/watch?v=tc0CKG0faZU