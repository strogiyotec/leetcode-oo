package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Majority Element.
 * See {@link <a href ="https://leetcode.com/problems/majority-element/">https://leetcode.com/problems/majority-element/</a>}
 */
class Majority {

    int majorityElement(final int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>(nums.length);
        int maxKey = 0;
        int maxValue = 0;
        for (int i : nums) {
            int val = map.merge(i, 1, Integer::sum);
            if (val > maxValue) {
                maxValue = val;
                maxKey = i;
            }
        }
        return maxKey;
    }
}
