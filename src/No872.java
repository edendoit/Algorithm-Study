public class No872 {
//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> leaves1 = new ArrayList();
//        List<Integer> leaves2 = new ArrayList();
//        dfs(leaves1, root1);
//        dfs(leaves2, root2);
//
//        return leaves1.equals(leaves2);
//    }
//
//    private void dfs(List<Integer> leafValues, TreeNode root) {
//        if(root==null) return;
//        if(root.left == null && root.right == null)
//            leafValues.add(root.val);
//
//        dfs(leafValues, root.left);
//        dfs(leafValues, root.right);
//    }
}
// https://www.youtube.com/watch?v=uL8YJsJ_3cY