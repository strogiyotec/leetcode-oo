package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Mode in bst.
 * See {@link <a href ="https://leetcode.com/problems/find-mode-in-binary-search-tree/">https://leetcode.com/problems/find-mode-in-binary-search-tree/</a>}
 */
final class ModeInBst {

    private PlainTree prev;

    private int cnt = 0;

    private int max = -1;

    int[] findMode(final PlainTree root) {
        final List<Integer> nodes = new ArrayList<>(16);
        this.prev = root;
        this.traverse(root, nodes);
        return nodes.stream().mapToInt(t -> t).toArray();
    }

    private void traverse(final PlainTree root, final List<Integer> nodes) {
        if (root != null) {
            this.traverse(root.left, nodes);
            if (root.val == this.prev.val) {
                this.cnt++;
            } else {
                this.cnt = 1;
            }
            if (this.max == this.cnt) {
                nodes.add(root.val);
            } else if (this.cnt > this.max) {
                nodes.clear();
                this.max = this.cnt;
                nodes.add(root.val);
            }
            this.prev = root;
            this.traverse(root.right, nodes);
        }
    }
}
