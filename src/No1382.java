public class No1382 {
//    List<TreeNode> sortedArr = new ArrayList();
//    public TreeNode balanceBST(TreeNode root) {
//        inorderTraverse(root);
//        return sortedArrayToBST(0, sortedArr.size()-1);
//    }
//
//    void inorderTraverse(TreeNode root) {
//        if(root == null) return;
//        inorderTraverse(root.left);
//        sortedArr.add(root);
//        inorderTraverse(root.right);
//    }
//
//    TreeNode sortedArrayToBST(int start, int end) {
//        if (start>end) return null;
//        int mid = start + (end-start) / 2;
//
//        TreeNode root = sortedArr.get(mid);
//        root.left = sortedArrayToBST(start, mid-1);
//        root.right = sortedArrayToBST(mid+1, end);
//        return root;
//    }
}
// https://leetcode.com/problems/balance-a-binary-search-tree/discuss/539686/JavaC%2B%2B-Sorted-Array-to-BST-O(N)-Clean-code
