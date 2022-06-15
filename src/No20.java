import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class No20 {
    public boolean isValid(String s) {
        char[] sToChar = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        int count = 0, dCount=0;
        for(int i=0; i<s.length(); i++) {
            stack.push(sToChar[i]);
            if(sToChar[i]=='(' || sToChar[i]=='[' || sToChar[i]=='{') {
                count++;
            } else {
                dCount++;
            }
            }
        if(count != dCount) return false;
        else {
            for(int i=0; i<s.length(); i++) {

            }
        }

return true;

    }


}
