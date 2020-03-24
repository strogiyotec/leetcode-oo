package leetcode.oo.sort;

import leetcode.oo.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k Sorted Lists.
 * See {@link <a href ="https://leetcode.com/problems/merge-k-sorted-lists/">https://leetcode.com/problems/merge-k-sorted-lists/</a>}
 */
public final class SortedLists {

    /**
     * Merge sorted lists.
     *
     * @param lists Lists
     * @return Merged list
     */
    public ListNode mergeKList(final ListNode[] lists) {
        final PriorityQueue<ListNode> queue = new PriorityQueue<>(
                lists.length == 0 ? 1 : lists.length,
                Comparator.comparingInt(value -> value.val)
        );
        for (int i = 0; i < lists.length; i++) {
            final ListNode node = lists[i];
            if (node != null) {
                queue.add(node);
            }
        }
        final ListNode head = new ListNode(0);
        ListNode point = head;
        while (!queue.isEmpty()) {
            point.next = queue.poll();
            point = point.next;
            if (point.next != null) {
                queue.add(point.next);
            }
        }
        return head.next;
    }
}
