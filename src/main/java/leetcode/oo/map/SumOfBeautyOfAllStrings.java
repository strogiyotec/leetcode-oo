package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
final class SumOfBeautyOfAllStrings {

    int beautySum(final String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            final Map<Character, Integer> cnt = new HashMap<>(26);
            for (int j = i; j < word.length(); j++) {
                cnt.merge(word.charAt(j), 1, Integer::sum);
                sum += this.minMax(cnt);
            }
        }
        return sum;
    }

    private int minMax(final Map<Character, Integer> cnt) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (final Integer value : cnt.values()) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        return max - min;
    }
}
