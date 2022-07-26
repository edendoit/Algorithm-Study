import javax.swing.tree.TreeNode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//public class No653 {
//
//    public boolean findTarget(TreeNode root, int k) {
//
//        if(root == null) return false;
//
//        Set<Integer> set = new HashSet<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        // q에 root 넣기
//        q.offer(root);
//
//        // q가 비어있지 않다면
//        while(!q.isEmpty()) {
//            // 현재는 q에서 remove한 값
//            TreeNode current = q.poll();
//            // set에 k-현재노드값이 있으면 참
//            if(set.contains(k-current.val)) {
//                return true;
//            }
//            // set에 현재노드값 추가
//            set.add(current.val);
//
//            // 왼쪽 오른쪽 담기
//            if(current.left != null) q.offer(current.left);
//            if(current.right != null) q.offer(current.right);
//        }
//        return false;
//    }
//}

// https://ifuwanna.tistory.com/400?category=913461