package leetcode.oo.tree;

public final class MergeTrees {

    public static void main(final String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        final PlainTree second = new PlainTree(2);
        final PlainTree merge = new MergeTrees().merge(tree, second);
        System.out.println(merge);

    }

    private PlainTree merge(final PlainTree first, final PlainTree second) {
        if (first == null && second == null) {
            return null;
        }
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        first.val += second.val;
        first.left = this.merge(first.left, second.left);
        first.right = this.merge(first.right, second.right);
        return first;
    }
}
