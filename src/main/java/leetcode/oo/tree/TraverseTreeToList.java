package leetcode.oo.tree;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public final class TraverseTreeToList {

    private PlainTree prev;

    public static void main(final String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.left.right = new PlainTree(4);
        tree.right = new PlainTree(5);
        tree.right.right = new PlainTree(6);
        new TraverseTreeToList().flatten(tree);
        System.out.println(tree);
    }

    public void flatten(final PlainTree root) {
        if (root == null) {
            return;
        }
        this.flatten(root.right);
        this.flatten(root.left);
        root.right = this.prev;
        root.left = null;
        this.prev = root;
    }

}
