public class No2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode cur = l3;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return l3.next;

    }
    // https://leetcode.com/problems/add-two-numbers/editorial/
}
