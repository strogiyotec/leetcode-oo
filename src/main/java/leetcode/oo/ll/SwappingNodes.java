package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public final class SwappingNodes {

    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        for (ListNode node = head; node != null; node = node.next) {
            size++;
        }
        ListNode fromBeg = null;
        ListNode fromEnd = null;
        int cnt = 1;
        ListNode current = head;
        while (current != null) {
            if (cnt == k) {
                fromBeg = current;
            }
            if (size - cnt+1 == k) {
                fromEnd = current;
            }
            current = current.next;
            cnt++;
        }
        int temp = fromBeg.val;
        fromBeg.val = fromEnd.val;
        fromEnd.val = temp;
        return head;
    }
}
