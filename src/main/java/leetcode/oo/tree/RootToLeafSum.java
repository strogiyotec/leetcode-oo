package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Sum Root to Leaf Numbers.
 * See {@link <a href ="https://leetcode.com/problems/sum-root-to-leaf-numbers/">https://leetcode.com/problems/sum-root-to-leaf-numbers/</a>}.
 */
final class RootToLeafSum {

    int sumNumbers(final PlainTree root) {
        if (root == null) {
            return 0;
        }
        final List<String> numbers = new ArrayList<>();
        this.toLeaf(numbers, new StringBuilder(), root);
        return numbers.stream().mapToInt(Integer::parseInt).sum();
    }

    private void toLeaf(
            final List<String> numbers,
            final StringBuilder current,
            final PlainTree tree
    ) {
        if (tree.left == null && tree.right == null) {
            current.append(tree.val);
            numbers.add(current.toString());
            return;
        }
        current.append(tree.val);
        if (tree.left != null) {
            this.toLeaf(numbers, current, tree.left);
            if (current.length() != 0) {
                current.deleteCharAt(current.length() - 1);
            }
        }
        if (tree.right != null) {
            this.toLeaf(numbers, current, tree.right);
            if (current.length() != 0) {
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}
