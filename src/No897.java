public class No897 {
//    public TreeNode increasingBST(TreeNode root) {
//        return increasingBST(root, null);
//    }
//    public TreeNode increasingBST(TreeNode root, TreeNode tail) {
//        if(root == null) return tail;
//        TreeNode res = increasingBST(root.left, root);
//        root.left = null;
//        root.right = increasingBST(root.right, tail);
//        return res;
//    }
}
// https://leetcode.com/problems/increasing-order-search-tree/discuss/165885/C%2B%2BJavaPython-Self-Explained-5-line-O(N)