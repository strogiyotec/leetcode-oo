package leetcode.oo.arrays.matrix;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
public final class SmallestElementInMatrix {

    public static void main(final String[] args) {
        System.out.println(
            new SmallestElementInMatrix().kthSmallest(
                new int[][]{
                    {1, 5, 9}, {10, 11, 13}, {12, 13, 15}
                },
                8
            )
        );
    }

    public int kthSmallest(int[][] matrix, int k) {
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> matrix[o[0]][o[1]]));
        for (int i = 0; i < matrix[0].length; i++) {
            queue.add(new int[]{0, i});
        }
        for (int i = 0; i < k - 1; i++) {
            final int[] pool = queue.poll();
            final int row = pool[0];
            final int col = pool[1];
            if (row == matrix.length - 1) {
                continue;
            } else {
                queue.add(new int[]{row + 1, col});
            }
        }
        final int[] poll = queue.poll();
        return matrix[poll[0]][poll[1]];
    }
}
