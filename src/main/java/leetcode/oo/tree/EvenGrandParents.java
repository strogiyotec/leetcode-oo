package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
final class EvenGrandParents {

    int sumEvenGrandparent(final PlainTree root) {
        final Queue<PlainTree> queue = new ArrayDeque<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            final PlainTree poll = queue.poll();
            if (poll.left != null) {
                queue.add(poll.left);
                if (poll.val % 2 == 0) {
                    if (poll.left.left != null) {
                        sum += poll.left.left.val;
                    }
                    if (poll.left.right != null) {
                        sum += poll.left.right.val;
                    }
                }
            }
            if (poll.right != null) {
                queue.add(poll.right);
                if (poll.val % 2 == 0) {
                    if (poll.right.left != null) {
                        sum += poll.right.left.val;
                    }
                    if (poll.right.right != null) {
                        sum += poll.right.right.val;
                    }
                }
            }
        }
        return sum;
    }
}
