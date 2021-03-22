package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/tuple-with-same-product/
final class TuplesWithSameProduct {

    int tupleSameProduct(final int[] nums) {
        final Map<Integer, Integer> cnt = new HashMap<>(nums.length);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                final int mult = cnt.getOrDefault(nums[i] * nums[j], 0);
                ans += mult << 3;
                cnt.merge(nums[i] * nums[j], 1, Integer::sum);
            }
        }
        return ans;
    }
}
