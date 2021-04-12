package leetcode.oo.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public final class SortArrayByFreq {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortArrayByFreq().frequencySort(
            new int[]{2, 3, 1, 3, 2}
        )));
        System.out.println(Arrays.toString(new SortArrayByFreq().frequencySort(
            new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}
        )));
    }

    public int[] frequencySort(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (final int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            final Integer first = map.get(o1);
            final Integer second = map.get(o2);
            if (first.equals(second)) {
                return o2.compareTo(o1);
            } else {
                return first.compareTo(second);
            }
        });
        queue.addAll(map.keySet());
        final int[] freq = new int[nums.length];
        int index = 0;
        while (!queue.isEmpty()) {
            final Integer key = queue.poll();
            final Integer cnt = map.get(key);
            for (int j = 0; j < cnt; j++) {
                freq[index++] = key;
            }
        }
        return freq;
    }
}
