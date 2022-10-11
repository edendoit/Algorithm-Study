public class No1448 {
//    public int goodNodes(TreeNode root) {
//        return this.helper(root, Integer.MIN_VALUE);
//    }
//
//    private int helper(TreeNode root, int max) {
//        if(root == null) return 0;
//
//        int res = root.val < max ? 0 : 1;
//        max = Math.max(max, root.val);
//
//        return res + helper(root.left, max) + helper(root.right, max);
//    }
}
// https://www.youtube.com/watch?v=RSnZ48X1I5s