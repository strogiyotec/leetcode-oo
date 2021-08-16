package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/unique-binary-search-trees-ii/
public final class UniqueTreeII {

    public List<PlainTree> generateTrees(final int n) {
        if (n == 0) {
            return Collections.emptyList();
        }
        return this.generate(1, n);
    }

    private List<PlainTree> generate(final int left, final int right) {
        if (left > right) {
            return Collections.singletonList(null);
        }
        final List<PlainTree> generated = new ArrayList<>(16);
        for (int i = left; i <= right; i++) {
            final List<PlainTree> leftTrees = this.generate(left, i - 1);
            final List<PlainTree> rightTrees = this.generate(i + 1, right);
            for (final PlainTree rightTree : rightTrees) {
                for (final PlainTree leftTree : leftTrees) {
                    final PlainTree tree = new PlainTree(i);
                    tree.right = rightTree;
                    tree.left = leftTree;
                    generated.add(tree);
                }
            }
        }
        return generated;
    }
}
