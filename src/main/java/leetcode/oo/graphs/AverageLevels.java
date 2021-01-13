package leetcode.oo.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
final class AverageLevels {

    List<Double> averageOfLevels(final PlainTree root) {
        final Queue<PlainTree> queue = new ArrayDeque<>(Collections.singletonList(root));
        final List<Double> list = new ArrayList<>(16);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            int cnt = 0;
            long sum = 0;
            for (int i = 0; i < size; i++) {
                final PlainTree poll = queue.poll();
                cnt++;
                sum += poll.val;
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            list.add((double) sum / (double) cnt);
        }
        return list;
    }
}
