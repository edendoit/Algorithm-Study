import java.util.Stack;

//class TreeNode {
//    int val;
//    TreeNode left, right;
//    TreeNode(){}
//    TreeNode(int val) {this.val = val;}
//    TreeNode(int val, TreeNode left, TreeNode right) {this.val = val;
//    this.left = left;
//    this.right = right;
//    }
//}
public class No404 {
    // dfs
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int ans = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right==null) {
                ans += root.left.val;
            } else {
                ans +=sumOfLeftLeaves(root.left);
            }
        }
        ans += sumOfLeftLeaves(root.right);
        return ans;
    }

    // bfs
    public int sumOfLeftLeaves2(TreeNode root) {
        if(root==null) return 0;
        int ans = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left != null) {
                if(node.left.left == null && node.left.right == null) ans+=node.left.val;
                else stack.push(node.left);

            }

            if(node.right != null) {
                if(node.right.left != null || node.right.right != null) {
                    stack.push(node.right);
                }
            }


        }
        return ans;
    }
 // https://leetcode.com/problems/sum-of-left-leaves/solutions/88950/java-iterative-and-recursive-solutions/
}
