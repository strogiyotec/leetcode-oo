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
        final List<String> list = new ArrayList<>(16);
        this.toLeaf(root, list, new StringBuilder(16));
        return list.stream().mapToInt(Integer::valueOf).sum();
    }

    private void toLeaf(final PlainTree root, final List<String> list, final StringBuilder builder) {
        builder.append(root.val);
        if(root.left == null && root.right == null){
            list.add(builder.toString());
        }
        if (root.left != null) {
            this.toLeaf(root.left, list, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (root.right != null) {
            this.toLeaf(root.right, list, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

}
