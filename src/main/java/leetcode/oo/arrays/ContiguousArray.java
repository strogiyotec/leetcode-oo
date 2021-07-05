package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/contiguous-array/
final class ContiguousArray {

    int findMaxLength(final int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>(nums.length);
        int maxLength = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            if (sum == 0) {
                maxLength = i + 1;
            } else if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
