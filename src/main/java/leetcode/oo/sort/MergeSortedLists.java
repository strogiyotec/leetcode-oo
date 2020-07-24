package leetcode.oo.sort;

import leetcode.oo.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Merge k Sorted Lists.
 * See {@link <a href ="https://leetcode.com/problems/merge-k-sorted-lists/">https://leetcode.com/problems/merge-k-sorted-lists/</a>}
 */
final class MergeSortedLists {

    /**
     * Merge sorted lists.
     *
     * @param lists Lists
     * @return Merged list
     */
    ListNode mergeKList(final ListNode[] lists) {
        final Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(value -> value.val));
        ListNode node = null;
        ListNode next = null;
        for (final ListNode list : lists) {
            if (list != null) {
                queue.offer(list);
            }
        }
        while (!queue.isEmpty()) {
            ListNode poll = queue.poll();
            if (node == null) {
                node = poll;
                next = node;
            } else {
                next.next = poll;
                next = next.next;
            }
            poll = poll.next;
            if (poll != null) {
                queue.offer(poll);
            }
        }
        return node;
    }
}
