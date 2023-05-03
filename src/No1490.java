import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;


    public Node() {
        children = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }

    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class No1490 {
    // recursive
    // https://leetcode.com/problems/clone-n-ary-tree/editorial/
    public Node cloneTree(Node root) {
        if(root == null) return null;

        Node cur = new Node(root.val);

        for(Node child : root.children) {
            cur.children.add(this.cloneTree(child));
        }
        return cur;
    }
}
