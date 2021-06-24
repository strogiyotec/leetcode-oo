package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/
public final class NonOverLappingArraysSum {

    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length, acc[] = new int[n + 1], dp[] = new int[n + 1], minLen = Integer.MAX_VALUE, res = minLen;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < acc.length; i++) {
            if (i > 0) acc[i] = acc[i - 1] + arr[i - 1];
            if (map.containsKey(acc[i] - target)){
                int preIdx = map.get(acc[i] - target);
                minLen = Math.min(minLen, i - preIdx);
                if (dp[preIdx] < Integer.MAX_VALUE) res = Math.min(res, i - preIdx + dp[preIdx]);
            }
            map.put(acc[i], i); // empty array
            dp[i] = minLen;
        }
        return res < Integer.MAX_VALUE ? res : -1;
    }


}
