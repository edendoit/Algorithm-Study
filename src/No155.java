import java.util.Stack;

public class No155 {
    // 스택을 뭐로 구현하는지..?
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int val) {
        if(val<=min) {
            stack.push(min);
            min = val;
        } stack.push(val);
    }

    public void pop() {
        if(stack.peek() == min) {
            stack.pop();
            min = stack.pop();
        } else stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(stack.peek() <= min) return stack.peek();
        else return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */