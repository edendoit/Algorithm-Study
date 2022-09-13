public class No783 {
//    Integer res, prev;
//    public int minDiffInBST(TreeNode root) {
//        res = Integer.MAX_VALUE;
//        prev = null;
//        inorder(root);
//        return res;
//    }
//    public void inorder(TreeNode root) {
//        if(root == null) return;
//
//        inorder(root.left);
//        if(prev != null) {
//            res = Math.min(res, root.val - prev);
//        }
//        prev = root.val;
//        inorder(root.right);
//    }
}
// https://leetcode.com/problems/minimum-distance-between-bst-nodes/discuss/128097/Java-4ms-beats-100