import javax.swing.tree.TreeNode;

public class No110 {
//    public boolean isBalanced(TreeNode root) {
//        if(root == null) {
//            return true;
//        }
//        return helper(root) != -1;
//    }
//
//    private int helper(TreeNode root) {
//        if(root == null) return 0;
//
//        int left = helper(root.left);
//        int right = helper(root.right);
//        if(left==-1 || right==-1 || Math.abs(left-right)>1) {
//            return -1;
//        }
//        return Math.max(left, right) + 1;
//    }
}
// https://leetcode.com/problems/balanced-binary-tree/solutions/35691/the-bottom-up-o-n-solution-would-be-better/?envType=study-plan&id=level-2&orderBy=most_votes