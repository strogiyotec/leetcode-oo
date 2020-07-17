package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;


/**
 * Two sum.
 * See {@link <a href ="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a>}
 */
final class TwoSum {

    int[] twoSum(final int[] nums, final int target) {
        final Map<Integer, Integer> cache = new HashMap<>(nums.length + 1);
        for (int i = 0; i < nums.length; i++) {
            cache.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            final int diff = target - nums[i];
            final Integer index = cache.get(diff);
            if (index != null && !index.equals(i)) {
                return new int[]{i, index};
            }
        }
        return new int[0];
    }
}
