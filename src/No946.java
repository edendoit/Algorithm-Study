import java.util.Stack;

public class No946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int N = pushed.length;
        Stack<Integer> stack = new Stack<>();

        int j=0;
        for(int x:pushed) {
            stack.push(x);
            // 스택이 안비었고
            // pop한게 popped[j]와 같을때,,
            while(!stack.isEmpty() && j<N && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j==N;
    }
}
// https://leetcode.com/problems/validate-stack-sequences/editorial/