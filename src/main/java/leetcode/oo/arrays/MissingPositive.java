package leetcode.oo.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * First missing positive.
 * See {@link <a href ="https://leetcode.com/problems/first-missing-positive/">https://leetcode.com/problems/first-missing-positive/</a>}
 */
final class MissingPositive {

    int firstMissingPositive(final int[] nums) {
        final Set<Integer> set = new HashSet<>(nums.length);
        for (final int num : nums) {
            if (num > 0 && num <= nums.length) {
                set.add(num);
            }
        }
        int index = 1;
        while (index <= nums.length) {
            if (!set.remove(index)) {
                return index;
            }
            index++;
        }
        return set.isEmpty() ? nums.length + 1 : nums.length;
    }
}
