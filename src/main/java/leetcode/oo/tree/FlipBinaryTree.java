package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/
public final class FlipBinaryTree {

    public List<Integer> flipMatchVoyage(PlainTree root, int[] voyage) {
        final List<Integer> storage = new ArrayList<>(voyage.length);
        final int index = this.dfs(root, 0, voyage, storage);
        if (index == -1) {
            return Collections.singletonList(-1);
        } else {
            return storage;
        }
    }

    private int dfs(final PlainTree root, int index, final int[] voyage, final List<Integer> storage) {
        if (index == -1) {
            return -1;
        }
        if (root == null) {
            return index;
        }
        if (root.val != voyage[index]) {
            return -1;
        }
        index++;
        if (root.left != null && root.left.val != voyage[index] && root.right != null && root.right.val == voyage[index]) {
            storage.add(root.val);
            final int indexRight = this.dfs(root.right, index, voyage, storage);
            return this.dfs(root.left, indexRight, voyage, storage);
        }
        final int indexLeft = this.dfs(root.left, index, voyage, storage);
        return this.dfs(root.right, indexLeft, voyage, storage);
    }
}
