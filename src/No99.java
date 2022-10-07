public class No99 {
//    TreeNode firstElement = null;
//    TreeNode secondElement = null;
//    TreeNode prevElement = null;
//
//    public void recoverTree(TreeNode root) {
//        traverse(root);
//        int temp = firstElement.val;
//        firstElement.val = secondElement.val;
//        secondElement.val = temp;
//
//    }
//
//    private void traverse(TreeNode root) {
//        if(root == null) return;
//
//        traverse(root.left);
//
//        if(prevElement != null) {
//            if(firstElement == null && prevElement.val >= root.val) {
//                firstElement = prevElement;
//            }
//        }
//        if(firstElement != null && prevElement.val >= root.val) {
//            secondElement = root;
//        }
//        prevElement = root;
//
//        traverse(root.right);
//    }
}
// https://leetcode.com/problems/recover-binary-search-tree/discuss/32535/No-Fancy-Algorithm-just-Simple-and-Powerful-In-Order-Traversal