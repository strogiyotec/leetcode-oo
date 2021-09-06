package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/find-k-closest-elements/
public final class FindKClosest {

    public static void main(String[] args) {
        System.out.println(new FindKClosest().findClosestElements(
            new int[]{1, 2, 3, 4, 5},
            4, 3
        ));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1 - x) == Math.abs(o2 - x)) {
                return Integer.compare(o1, o2);
            } else {
                return Integer.compare(
                    Math.abs(o1 - x),
                    Math.abs(o2 - x)
                );
            }
        });
        for (final int i : arr) {
            queue.add(i);
        }
        final List<Integer> solution = new ArrayList<>(k + 1);
        for (int i = 0; i < k; i++) {
            solution.add(queue.poll());
        }
        solution.sort(null);
        return solution;
    }
}
