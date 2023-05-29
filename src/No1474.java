 class ListNode {
    int val;
     ListNode next;
     ListNode() {}

     ListNode(int val) {
        this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
}
public class No1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode cur = head, pre = null;
        while(cur != null) {
            int i=m, j=n;

            while(cur != null && i-- >0) {
                pre = cur;
                cur = cur.next;
            }

            while(cur != null && j -- >0) {
                cur = cur.next;
            }
            pre.next = cur;
        }
        return head;
    }
}
// https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/solutions/687977/java-easy-and-concise/