package leetcode.oo;

/**
 * Single List Node.
 */
@SuppressWarnings("VisibilityModifier")
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

    /**
     * Add node to tail.
     *
     * @param variable Val of node
     * @return Current node with new tail
     */
    public ListNode withNext(final int variable) {
        ListNode head = this;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(variable);
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
