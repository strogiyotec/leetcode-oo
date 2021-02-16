package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
final class WeakestRowsMatrix {

    int[] kWeakestRows(final int[][] mat, final int k) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            map.put(i, 0);
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    map.merge(i, 1, Integer::sum);
                }
            }
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if (map.get(o1).equals(map.get(o2))) {
                return o1 - o2;
            } else {
                return map.get(o1) - map.get(o2);
            }
        });
        queue.addAll(map.keySet());
        final int[] solution = new int[k];
        for (int i = 0; i < k; i++) {
            solution[i] = queue.poll();
        }
        return solution;
    }
}
