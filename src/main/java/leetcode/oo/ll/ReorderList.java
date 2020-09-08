package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Reorder list.
 * See {@link <a href ="https://leetcode.com/problems/reorder-list/">https://leetcode.com/problems/reorder-list/</a>}
 */
final class ReorderList {

    void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        final int[] size = new int[1];
        final ListNode temp = this.copy(head);
        ListNode reversed = this.reverse(temp, size);
        ListNode front = head.next;
        ListNode dump = head;
        int cnt = 0;
        while (cnt < size[0]) {
            if (cnt % 2 == 0) {
                dump.next = reversed;
                reversed = reversed.next;
                dump = dump.next;
            } else {
                dump.next = front;
                front = front.next;
                dump = dump.next;
            }
            cnt++;
        }
        dump.next = null;
    }

    private ListNode copy(ListNode origin) {
        final ListNode listNode = new ListNode(-1);
        ListNode temp = listNode;
        while (origin != null) {
            temp.next = new ListNode(origin.val);
            origin = origin.next;
            temp = temp.next;
        }
        return listNode.next;
    }

    private ListNode reverse(final ListNode head, final int[] size) {
        if (head.next == null) {
            return head;
        }
        final ListNode reversed = this.reverse(head.next, size);
        head.next.next = head;
        head.next = null;
        size[0]++;
        return reversed;
    }
}
