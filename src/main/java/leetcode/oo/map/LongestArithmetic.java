package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
public final class LongestArithmetic {

    public int longestSubsequence(int[] arr, int difference) {
        final Map<Integer, Integer> map = new HashMap<>(arr.length);
        int max = 0;
        for (final int number : arr) {
            final int length = map.getOrDefault(number - difference, 0);
            map.put(number, length + 1);
            max = Math.max(max,map.get(number));
        }
        return max;
    }
}
