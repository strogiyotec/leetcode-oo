package leetcode.oo.pointers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Minimum Operations to Reduce X to Zero.
 * See {@link <a href ="https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/">https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/</a>}.
 */
final class MinOperationsX {

    int minOperations(final int[] nums, final int x) {
        final int sum = IntStream.of(nums).sum();
        final int diff = sum - x;
        if (diff == 0) {
            return nums.length;
        }
        final Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(0, -1);
        int totalSum = 0;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            if (map.containsKey(totalSum - diff)) {
                index = Math.max(index, i - map.get(totalSum - diff));
            }
            map.put(totalSum, i);
        }
        return index == Integer.MIN_VALUE ? -1 : nums.length - index;
    }
}
