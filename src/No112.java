public class No112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        targetSum -= root.val;
        if((root.left == null) && (root.right == null)) return targetSum==0;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
// https://leetcode.com/problems/path-sum/editorial/
