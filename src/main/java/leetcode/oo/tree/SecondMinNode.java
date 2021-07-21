package leetcode.oo.tree;

import java.util.SortedSet;
import java.util.TreeSet;

//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
public final class SecondMinNode {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(2);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(5);
        tree.right.left = new PlainTree(5);
        tree.right.right = new PlainTree(7);
        System.out.println(new SecondMinNode().findSecondMinimumValue(tree));
    }

    public int findSecondMinimumValue(final PlainTree root) {
        final TreeSet<Integer> set = new TreeSet<>();
        this.inOrder(root, set);
        if (set.size() < 2) {
            return -1;
        }
        return set.higher(set.first());
    }

    private void inOrder(final PlainTree root, final SortedSet<Integer> set) {
        if (root != null) {
            this.inOrder(root.left, set);
            set.add(root.val);
            this.inOrder(root.right, set);
        }
    }

}
