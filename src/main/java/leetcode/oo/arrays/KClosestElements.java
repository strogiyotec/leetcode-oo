package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * K Closest Points to Origin.
 * See {@link <a href ="https://leetcode.com/problems/k-closest-points-to-origin/">https://leetcode.com/problems/k-closest-points-to-origin/</a>}
 */
final class KClosestElements {

    int[][] kClosest(final int[][] points, final int K) {
        final Map<int[], Integer> distance = new HashMap<>(points.length, 1.0f);
        for (final int[] point : points) {
            distance.put(
                point,
                point[0] * point[0] + point[1] * point[1]
            );
        }
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(distance::get));
        queue.addAll(distance.keySet());
        final int[][] answer = new int[K][2];
        for (int i = 0; i < K; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}
