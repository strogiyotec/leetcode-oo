package leetcode.oo.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
final class FromInorderPostOrder {

    PlainTree buildTree(int[] inorder, int[] postorder) {
        final Map<Integer, Integer> map = new HashMap<>(inorder.length << 1);
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        final LinkedList<Integer> list = new LinkedList<>();
        for (final int i : postorder) {
            list.add(i);
        }
        return this.build(list, map, 0, list.size() - 1);
    }

    private PlainTree build(final LinkedList<Integer> list, final Map<Integer, Integer> map, final int left, final int right) {
        if (left > right || list.isEmpty()) {
            return null;
        }
        final PlainTree tree = new PlainTree(list.removeLast());
        tree.right = this.build(list, map, map.get(tree.val) + 1, right);
        tree.left = this.build(list, map, left, map.get(tree.val) - 1);
        return tree;
    }

}
