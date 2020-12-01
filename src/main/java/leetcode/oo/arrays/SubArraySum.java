package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;


/**
 * Subarray sum is equals to K.
 * See {@link <a href ="https://leetcode.com/problems/subarray-sum-equals-k/">https://leetcode.com/problems/subarray-sum-equals-k/</a>}.
 */
final class SubArraySum {

    int subarraySum(final int[] nums, final int k) {
        final Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(0, 1);
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            answer += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return answer;
    }
}
