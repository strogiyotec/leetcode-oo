package leetcode.oo.tree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
final class FromInorderPostOrder {

    PlainTree buildTree(int[] inorder, int[] postorder) {
        final Map<Integer, Integer> inOrderIndex = new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; i++) {
            inOrderIndex.put(inorder[i], i);
        }
        final List<Integer> list = IntStream.of(postorder).boxed().collect(Collectors.toList());
        return this.build(inOrderIndex, list, 0, list.size() - 1);
    }

    private PlainTree build(
        final Map<Integer, Integer> inOrderIndex,
        final List<Integer> postOrder,
        final int left,
        final int right
    ) {
        if (left > right) {
            return null;
        }
        final PlainTree root = new PlainTree(postOrder.remove(postOrder.size() - 1));
        final int middle = inOrderIndex.get(root.val);
        root.right = this.build(inOrderIndex, postOrder, middle + 1, right);
        root.left = this.build(inOrderIndex, postOrder, left, middle - 1);
        return root;
    }
}
