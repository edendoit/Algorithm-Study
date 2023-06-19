import java.util.LinkedList;
import java.util.List;

public class No95 {
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    private List<TreeNode> helper(int j, int i) {
        List<TreeNode> res = new LinkedList<>();
        if(j>i) {
            res.add(null);
            return res;
        }

        for(int k=j; k<=i; k++) {
            List<TreeNode> leftTree = helper(j, k-1);
            List<TreeNode> rightTree = helper(k+1, i);

            for(TreeNode left : leftTree) {
                for(TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(k);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
    // https://leetcode.com/problems/unique-binary-search-trees-ii/solutions/31508/divide-and-conquer-f-i-g-i-1-g-n-i/?envType=study-plan-v2&envId=dynamic-programming

}
