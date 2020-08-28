package leetcode.oo.tree;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Kth Smallest Element in a BST.
 * See {@link <a href ="https://leetcode.com/problems/kth-smallest-element-in-a-bst/">https://leetcode.com/problems/kth-smallest-element-in-a-bst/</a>}
 */
final class KthSmallest {

    int kthSmallest(final TreeNode root, final int k) {
        final int[] elements = new int[k];
        this.smallest(root, elements, new AtomicInteger());
        return elements[k - 1];
    }

    private void smallest(final TreeNode node, final int[] elements, AtomicInteger position) {
        if (node != null) {
            this.smallest(node.left(), elements, position);
            if (position.get() == elements.length) {
                return;
            } else {
                elements[position.getAndIncrement()] = node.value();
            }
            this.smallest(node.right(), elements, position);
        }
    }
}
