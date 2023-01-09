package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
public final class LongestArithmetic {

    public int longestSubsequence(int[] arr, int difference) {
        final Map<Integer, Integer> lengthMap = new HashMap<>(arr.length);
        int max = 0;
        for (final int num : arr) {
            final int length = lengthMap.getOrDefault(num - difference, 0);
            lengthMap.put(num, length + 1);
            max = Math.max(
                length+1,
                max
            );
        }
        return max;
    }
}
