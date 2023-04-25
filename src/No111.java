public class No111 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
        // https://leetcode.com/problems/maximum-depth-of-binary-tree/solutions/176802/maximum-depth-of-binary-tree/

    }
        public int minDepth (TreeNode root){
            if (root == null) return 0;
            if (root.left == null && root.right == null) {
                return 1;
            }
            int min = Integer.MAX_VALUE;

            if (root.left != null) {
                min = Math.min(minDepth(root.left), min);
            }
            if (root.right != null) {
                min = Math.min(minDepth(root.right), min);
            }

            return min + 1;

        }
        // https://leetcode.com/problems/minimum-depth-of-binary-tree/editorial/


}