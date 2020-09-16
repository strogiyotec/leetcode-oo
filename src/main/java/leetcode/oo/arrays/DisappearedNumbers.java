package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find All Numbers Disappeared in an Array.
 * See {@link <a href ="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/</a>}
 */
final class DisappearedNumbers {

    List<Integer> findDisappearedNumbers(final int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        int min = 1;
        int max = nums.length;
        for (final int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        final List<Integer> missed = new ArrayList<>();
        while (min <= max && !map.isEmpty()) {
            final Integer value = map.computeIfPresent(min, (key, val) -> {
                int decrement = val - 1;
                if (decrement == -1) {
                    return null;
                } else {
                    return decrement;
                }
            });
            if (value == null) {
                missed.add(min);
            }
            min++;
        }
        return missed;
    }
}
