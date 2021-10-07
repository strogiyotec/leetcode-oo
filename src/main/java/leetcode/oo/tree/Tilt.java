package leetcode.oo.tree;

//https://leetcode.com/problems/binary-tree-tilt/
public final class Tilt {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(4);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(9);
        tree.left.left = new PlainTree(3);
        tree.left.right = new PlainTree(5);
        tree.right.right = new PlainTree(7);
        final int A = new Tilt().findTilt(tree);
        System.out.println(A);
    }

    private int cnt;

    public int findTilt(final PlainTree node) {
        this.sum(node);
        return this.cnt;
    }

    private int sum(final PlainTree node) {
        if (node == null) {
            return 0;
        }
        final int left = this.sum(node.left);
        final int right = this.sum(node.right);
        final int val = node.val;
        node.val = Math.abs(left - right);
        this.cnt += node.val;
        return val + left + right;
    }

}
