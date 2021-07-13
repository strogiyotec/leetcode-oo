package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public final class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        final ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = current.next.next;
        }
        return dummy.next;
    }
}
