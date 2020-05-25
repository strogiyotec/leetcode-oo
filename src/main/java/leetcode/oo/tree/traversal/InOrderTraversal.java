package leetcode.oo.tree.traversal;

import leetcode.oo.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * Binary Tree Inorder Traversal.
 * See {@link <a href ="https://leetcode.com/problems/binary-tree-inorder-traversal/">https://leetcode.com/problems/binary-tree-inorder-traversal/</a>}.
 */
public final class InOrderTraversal {

    /**
     * Travers node using inorder traversing.
     *
     * @param node Node to traverse.
     * @return List of traversed values
     */
    public List<Integer> travers(final TreeNode node) {
        final List<Integer> list = new ArrayList<>();
        this.travers(node, list);
        return list;
    }

    /**
     * Store traversed values in given list.
     *
     * @param node Node
     * @param list Storage
     */
    private void travers(final TreeNode node, final List<Integer> list) {
        if (node != null) {
            this.travers(node.left(), list);
            list.add(node.value());
            this.travers(node.right(), list);
        }
    }
}
