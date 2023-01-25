
public class No461 {
    public int hammingDistance(int x, int y) {
//         Stack<Integer> stack1 = new Stack<>();
//         Stack<Integer> stack2 = new Stack<>();

//         while(x != 0) {
//             stack1.push(x%2);
//             x /= 2;
//         }
//         stack1.push(0);

//         while(y != 0) {
//             stack2.push(y%2);
//             y /= 2;
//         }

//         int count = 0;
//         while(!stack1.isEmpty()) {
//             if(stack1.peek() != stack2.peek()) {
//                 count++;
//             }
//             stack1.pop();
//             stack2.pop();
//         }
//         while(!stack2.isEmpty()) {
//             if(stack2.peek()==1){
//                 count++;
//             }
//             stack2.pop();
//         }
//         return count;

        return Integer.bitCount(x ^ y);
    }
}

// https://leetcode.com/problems/hamming-distance/solutions/94698/java-1-line-solution-d/?orderBy=most_votes