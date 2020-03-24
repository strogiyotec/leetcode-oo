package leetcode.oo;

/**
 * Single List Node.
 */
public final class ListNode {
    /**
     * Value.
     */
    public final int val;

    /**
     * Next.
     */
    public ListNode next;

    /**
     * Ctor.
     *
     * @param value Val.
     */
    public ListNode(final int value) {
        this.val = value;
    }

    public ListNode withNext(final int val) {
        ListNode head = this;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(val);
        return this;
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
            result.append(temp.val);
            temp = temp.next;
            if (temp != null) {
                result.append("_");
            }
        }
        return result.toString();
    }
}
