public class No894 {
//    public List<TreeNode> allPossibleFBT(int n) {
//        List<TreeNode> res = new ArrayList();
//        if(n == 1) {
//            res.add(new TreeNode(0));
//            return res;
//        }
//        n = n-1;
//        for(int i=1; i<n; i+=2) {
//            List<TreeNode> left = allPossibleFBT(i);
//            List<TreeNode> right = allPossibleFBT(n-i);
//
//            for(TreeNode nl : left) {
//                for(TreeNode nr : right) {
//                    TreeNode cur = new TreeNode(0);
//                    cur.left = nl;
//                    cur.right = nr;
//                    res.add(cur);
//                }
//            }
//        }
//        return res;
//    }
}
// https://leetcode.com/problems/all-possible-full-binary-trees/discuss/163433/Java-Recursive-Solution-with-Explanation