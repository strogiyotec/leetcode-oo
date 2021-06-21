package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/problems/recover-binary-search-tree/
public final class RecoverBinaryTree {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(3);
        tree.left.right = new PlainTree(2);
        new RecoverBinaryTree().recoverTree(tree);
        System.out.println(tree.val);
    }

    public void recoverTree(PlainTree root) {
        final List<PlainTree> inOrder = new ArrayList<>();
        this.inOrder(root, inOrder);
        final List<Integer> sorted = inOrder.stream().map(node -> node.val).sorted().collect(Collectors.toList());
        for (int i = 0; i < sorted.size(); i++) {
            inOrder.get(i).val = sorted.get(i);
        }
    }

    private void inOrder(final PlainTree root, final List<PlainTree> inOrder) {
        if (root != null) {
            this.inOrder(root.left, inOrder);
            inOrder.add(root);
            this.inOrder(root.right, inOrder);
        }
    }

}
