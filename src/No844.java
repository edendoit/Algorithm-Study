import java.util.Stack;
import java.util.Vector;

public class No844 {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> fakeS = new Stack<Character>();
        Stack<Character> fakeT = new Stack<Character>();

        int i=0, j=0;
        while(i<s.length()) {
            if(s.charAt(i)=='#') {
                if(!fakeS.isEmpty())
                    fakeS.pop();

            } else {
                fakeS.push(s.charAt(i));
            }

            i++;
        } while(j<t.length()) {
            if(t.charAt(j)=='#') {
                if(!fakeT.isEmpty())
                    fakeT.pop();

            } else {
                fakeT.push(t.charAt(j));
            }

            j++;
        }
        if(fakeS.equals(fakeT)) return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println( backspaceCompare("ab##"
                ,"c#d#"));

    }


    public boolean backspaceCompare2(String s, String t) {

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {

            if(s.charAt(i) != '#') {
                stack1.push(s.charAt(i));

            } else if(!stack1.isEmpty()) {
                stack1.pop();
            }
        }

        for(int i=0; i<t.length(); i++) {

            if(t.charAt(i) != '#') {
                stack2.push(t.charAt(i));
            } else if(!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        if(stack1.size() != stack2.size()) return false;

        return stack1.equals(stack2);
    }

}
