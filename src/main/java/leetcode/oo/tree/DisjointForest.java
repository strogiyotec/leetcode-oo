package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/delete-nodes-and-return-forest/
final class DisjointForest {

    List<PlainTree> delNodes(PlainTree root, int[] to_delete) {
        final Set<Integer> set = IntStream.of(to_delete).boxed().collect(Collectors.toSet());
        final List<PlainTree> solution = new ArrayList<>();
        this.preOrder(set, solution, root, null, false);
        return solution;
    }

    private void preOrder(final Set<Integer> set, final List<PlainTree> solution, final PlainTree node, final PlainTree root, boolean isLeft) {
        if (node == null) {
            return;
        }
        if (set.contains(node.val)) {
            if (root != null) {
                if (isLeft) {
                    root.left = null;
                } else {
                    root.right = null;
                }
            }
            if (node.left != null && !set.contains(node.left.val)) {
                solution.add(node.left);
            }
            if (node.right != null && !set.contains(node.right.val)) {
                solution.add(node.right);
            }
        } else {
            if (root == null) {
                solution.add(node);
            }
        }
        this.preOrder(set, solution, node.left, node, true);
        this.preOrder(set, solution, node.right, node, false);
    }
}
