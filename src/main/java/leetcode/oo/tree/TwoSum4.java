package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Two Sum IV - Input is a BST.
 * See {@link <a href ="https://leetcode.com/problems/two-sum-iv-input-is-a-bst/">https://leetcode.com/problems/two-sum-iv-input-is-a-bst/</a>}
 */
final class TwoSum4 {

    boolean findTarget(final PlainTree root, final int sum) {
        final List<Integer> list = new ArrayList<>(16);
        this.inOrder(root, list);
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            final int currentSum = list.get(left) + list.get(right);
            if (currentSum == sum) {
                return true;
            } else if (currentSum > sum) {
                right--;
            } else {
                left++;
            }
        }
        return false;

    }

    private void inOrder(final PlainTree tree, final List<Integer> list) {
        if (tree != null) {
            this.inOrder(tree.left, list);
            list.add(tree.val);
            this.inOrder(tree.right, list);
        }
    }
}
