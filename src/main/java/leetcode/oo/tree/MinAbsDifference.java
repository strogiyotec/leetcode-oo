package leetcode.oo.tree;

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/
public final class MinAbsDifference {

    private int min = Integer.MAX_VALUE;

    private Integer prev;

    public int getMinimumDifference(final PlainTree root) {
        if (root == null) {
            return this.min;
        }
        this.getMinimumDifference(root.left);
        if (this.prev != null) {
            this.min = Math.min(this.min, root.val - this.prev);
        }
        this.prev = root.val;
        this.getMinimumDifference(root.right);
        return this.min;
    }
}
