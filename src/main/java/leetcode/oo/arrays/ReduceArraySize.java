package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/reduce-array-size-to-the-half/
public final class ReduceArraySize {

    public static void main(String[] args) {
        System.out.println(new ReduceArraySize().minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
    }

    public int minSetSize(final int[] arr) {
        int half = arr.length / 2;
        final Map<Integer, Integer> numToCnt = new HashMap<>(arr.length);
        for (final int number : arr) {
            numToCnt.merge(number, 1, Integer::sum);
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>(arr.length, Comparator.reverseOrder());
        queue.addAll(numToCnt.values());
        int cnt = 0;
        while (!queue.isEmpty() && half > 0) {
            half -= queue.poll();
            cnt++;
        }
        return cnt;
    }
}
