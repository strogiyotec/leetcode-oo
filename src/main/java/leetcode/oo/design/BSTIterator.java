package leetcode.oo.design;

import leetcode.oo.tree.PlainTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Search tree iterator.
 * See {@link <a href ="https://leetcode.com/problems/binary-search-tree-iterator/">https://leetcode.com/problems/binary-search-tree-iterator/</a>}
 */
final class BSTIterator {

    private List<Integer> nodes;

    private int position = 0;

    BSTIterator(PlainTree root) {
        this.nodes = new ArrayList<>();
        collect(this.nodes, root);
        System.out.println(this.nodes);
    }

    private static void collect(final List<Integer> storage, final PlainTree root) {
        if (root != null) {
            collect(storage, root.left);
            storage.add(root.val);
            collect(storage, root.right);
        }
    }

    /**
     * @return the next smallest number
     */
    int next() {
        return this.nodes.get(this.position++);
    }

    /**
     * @return whether we have a next smallest number
     */
    boolean hasNext() {
        return this.position < this.nodes.size();
    }
}
