public class No270 {
    public int closestValue(TreeNode root, double target) {
        int rnd = root.val;
        while(root != null) {
            if(Math.abs(target - root.val) <= Math.abs(target - rnd)) {
                rnd = root.val;

            }
            root = root.val > target ? root.left : root.right;
        }
        return rnd;
    }
}
// https://leetcode.com/problems/closest-binary-search-tree-value/solutions/70331/clean-and-concise-java-solution/