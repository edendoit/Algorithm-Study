public class No24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode second = head.next;

        cur.next = swapPairs(second.next);
        second.next = cur;

        return second;

    }
}
