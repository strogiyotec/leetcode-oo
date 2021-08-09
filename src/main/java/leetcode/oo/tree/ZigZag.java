package leetcode.oo.tree;

//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
public final class ZigZag {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.right = new PlainTree(1);
        tree.right.left = new PlainTree(1);
        tree.right.right = new PlainTree(1);
        tree.right.right.right = new PlainTree(1);
        tree.right.right.left = new PlainTree(1);
        tree.right.right.left.right = new PlainTree(1);
        tree.right.right.left.right.right = new PlainTree(1);
        System.out.println(new ZigZag().longestZigZag(tree));
    }

    private int longest = 0;

    public int longestZigZag(final PlainTree tree) {
        this.traversal(1, false, tree.left);
        this.traversal(1, true, tree.right);
        return this.longest;
    }

    private void traversal(int length, boolean isRight, PlainTree root) {
        if (root != null) {
            this.longest = Math.max(this.longest,length);
            if (isRight) {
                this.traversal(length + 1, false, root.left);
                this.traversal(1, true, root.right);
            } else{
                this.traversal(length + 1, true, root.right);
                this.traversal(1, false, root.left);
            }
        }
    }
}
