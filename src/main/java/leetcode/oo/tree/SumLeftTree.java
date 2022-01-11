package leetcode.oo.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/sum-of-left-leaves/
public final class SumLeftTree {

    public int sumOfLeftLeaves(final PlainTree root) {
        int cnt = 0;
        final Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root, false));
        while (!queue.isEmpty()) {
            final Tuple current = queue.poll();
            if (current.tree.left == null && current.tree.right == null && current.left) {
                cnt += current.tree.val;
            }
            if(current.tree.left != null){
                queue.add(new Tuple(current.tree.left,true));
            }
            if(current.tree.right != null){
                queue.add(new Tuple(current.tree.right,true));
            }
        }
        return cnt;
    }

    static class Tuple {

        final PlainTree tree;
        final boolean left;

        Tuple(final PlainTree tree, final boolean left) {
            this.tree = tree;
            this.left = left;
        }
    }
}
