package leetcode.oo.pointers;

/**
 * List with removed element from tail.
 * See {@link <a href ="https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/">https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/</a>}
 */
public final class RemovedList {

    /**
     * Remove Nth element from end.
     *
     * @param head     Head
     * @param position Position
     * @return Node with removed element
     */
    public ListNode removeNthFromEnd(final ListNode head, final int position) {
        final ListNode freshHead = new ListNode(0);
        ListNode start = freshHead;
        ListNode end = freshHead;
        freshHead.next = head;
        for (int i = 0; i <= position; i++) {
            end = end.next;
        }
        while (end != null) {
            end = end.next;
            start = start.next;
        }
        start.next = start.next.next;
        return freshHead.next;

    }

    /**
     * List Node.
     */
    @SuppressWarnings("VisibilityModifier")
    public static final class ListNode {
        /**
         * Value.
         */
        final int value;

        /**
         * Next.
         */
        ListNode next;

        /**
         * Ctor.
         *
         * @param value Val.
         */
        public ListNode(final int value) {
            this.value = value;
        }

        /**
         * String representation of node.
         * Concat all numbers using '_' as separator
         *
         * @return String representation
         */
        @Override
        public String toString() {
            final StringBuilder result = new StringBuilder();
            ListNode temp = this;
            while (temp != null) {
                result.append(temp.value);
                temp = temp.next;
                if (temp != null) {
                    result.append("_");
                }
            }
            return result.toString();
        }
    }
}
