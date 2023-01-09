package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public final class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        final ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode current = temp;
        while (current != null && current.next != null) {
            final ListNode first = current.next;
            final ListNode second = current.next.next;
            current.next = second;
            first.next = second.next;
            second.next = first;
            current = first;
        }
        return temp.next;
    }
}
