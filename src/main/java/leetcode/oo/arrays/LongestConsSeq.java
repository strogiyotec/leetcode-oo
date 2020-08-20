package leetcode.oo.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Consecutive sequence.
 * See {@link <a href ="https://leetcode.com/problems/longest-consecutive-sequence/">https://leetcode.com/problems/longest-consecutive-sequence/</a>}.
 */
final class LongestConsSeq {

    int longestConsecutive(final int[] nums) {
        final Set<Integer> set = new HashSet<>(nums.length + 2, 1);
        for (final int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (final int current : nums) {
            int left = current - 1;
            int right = current + 1;
            while (set.remove(left)) left--;
            while (set.remove(right)) right++;
            max = Math.max(max, right - left - 1);
            if (set.isEmpty()) {
                break;
            }

        }
        return max;

    }
}
