package leetcode.oo.tree;

//https://leetcode.com/problems/delete-node-in-a-bst/
final class DeleteNodeInTree {

    PlainTree deleteNode(PlainTree root, int key) {
        PlainTree current = root;
        PlainTree prev = null;
        while (current != null && current.val != key) {
            prev = current;
            if (current.val < key) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        if (prev == null) {
            return this.delete(current);
        }
        if (prev.left == current) {
            prev.left = this.delete(current);
        } else {
            prev.right = this.delete(current);
        }
        return root;
    }

    private PlainTree delete(final PlainTree current) {
        if (current.left == null) {
            return current.right;
        }
        if (current.right == null) {
            return current.left;
        }
        PlainTree prev = null;
        PlainTree successor = current.right;
        while (successor.left != null) {
            prev = successor;
            successor = successor.left;
        }
        successor.left = current.left;
        if (current.right != successor) {
            prev.left = successor.right;
            successor.right = current.right;
        }
        return successor;
    }
}
