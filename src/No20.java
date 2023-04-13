import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class No20 {
    public boolean isValid(String s) {

            if(s.length() % 2 != 0) return false;
            Stack<Character> stack = new Stack<>();

            for(char ch : s.toCharArray()) {
                if(ch == '(' || ch == '{' || ch == '[') {stack.push(ch);}
                else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else
                    return false;
            }

            return stack.isEmpty();
        }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()) {
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
 //  https://leetcode.com/problems/valid-parentheses/solutions/9178/short-java-solution/

    }


