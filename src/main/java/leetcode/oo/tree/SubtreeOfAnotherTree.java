package leetcode.oo.tree;

//https://leetcode.com/problems/subtree-of-another-tree/
final class SubtreeOfAnotherTree {

    boolean isSubtree(final PlainTree first, final PlainTree second) {
        if (first == null) {
            return false;
        }
        if (first.val == second.val) {
            final boolean same = this.same(first, second);
            if (same) {
                return true;
            }
        }
        return this.isSubtree(first.left, second) || this.isSubtree(first.right, second);
    }

    private boolean same(final PlainTree first, final PlainTree second) {
        if (first == null && second == null) {
            return true;
        }
        if (first == null) {
            return false;
        }
        if (second == null) {
            return false;
        }
        if (first.val != second.val) {
            return false;
        }
        return this.same(first.left, second.left) && this.same(first.right, second.right);
    }
}
