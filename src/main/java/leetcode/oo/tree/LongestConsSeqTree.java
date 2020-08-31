package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * BINARY TREE LONGEST CONSECUTIVE SEQUENCE.
 * See {@link <a href ="https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/">https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/</a>}.
 */
final class LongestConsSeqTree {

    int longestConsecutive(final TreeNode node) {
        final List<Integer> values = new ArrayList<>();
        this.postOrderTraversal(node, values);
        int max = 0;
        int left = 0;
        while (left < values.size()) {
            int right = left + 1;
            int temp = left;
            if (right < values.size()) {
                while (right < values.size() && values.get(temp) - values.get(right) == 1) {
                    right++;
                    temp++;
                }
                max = Math.max(max, right - left);
            }
            left = right;
        }
        return max;
    }

    private void postOrderTraversal(final TreeNode node, List<Integer> values) {
        if (node != null) {
            this.postOrderTraversal(node.left(), values);
            this.postOrderTraversal(node.right(), values);
            values.add(node.value());
        }
    }
}
