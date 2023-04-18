import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class No783 {
    Integer res, prev;
    public int minDiffInBST(TreeNode root) {
        res = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root) {
        if(root == null) return;

        inorder(root.left);
        if(prev != null) {
            res = Math.min(res, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
    // https://leetcode.com/problems/minimum-distance-between-bst-nodes/discuss/128097/Java-4ms-beats-100


    List<Integer> inorderNodes = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<inorderNodes.size(); i++) {
            min = Math.min(min, inorderNodes.get(i)-inorderNodes.get(i-1));
        }
        return min;

    }
    void inorderTraversal(TreeNode node) {
        if (node==null) return;

        inorderTraversal(node.left);
        inorderNodes.add(node.val);
        inorderTraversal(node.right);
    }
    // https://leetcode.com/problems/minimum-absolute-difference-in-bst/editorial/
}
