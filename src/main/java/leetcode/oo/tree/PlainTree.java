package leetcode.oo.tree;

public final class PlainTree {
    public PlainTree left;

    public PlainTree right;

    public int val;

    public PlainTree(final int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}
