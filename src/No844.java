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
}
