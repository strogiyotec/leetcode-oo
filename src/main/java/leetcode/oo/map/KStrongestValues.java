package leetcode.oo.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import leetcode.oo.IntPair;

//https://leetcode.com/problems/the-k-strongest-values-in-an-array/
final class KStrongestValues {

    int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        final int median = arr[(arr.length - 1) / 2];
        final PriorityQueue<IntPair> queue = new PriorityQueue<>(((Comparator<IntPair>) (o1, o2) -> {
            if (Math.abs(o1.getFirst() - median) > Math.abs(o2.getFirst() - median)) {
                return 1;
            } else if (Math.abs(o1.getFirst() - median) < Math.abs(o2.getFirst() - median)) {
                return -1;
            } else {
                return Integer.compare(o1.getSecond(), o2.getSecond());
            }
        }).reversed());
        for (int i = 0; i < arr.length; i++) {
            queue.offer(new IntPair(arr[i], i));
        }
        final int[] solution = new int[k];
        for (int i = 0; i < k; i++) {
            solution[i] = queue.poll().getFirst();
        }
        return solution;
    }
}
