package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/
final class MaxNumberOccurrenceSubstring {

    int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        final Map<String, Integer> subStringOccurances = new HashMap<>();
        final Map<Character, Integer> uniqueChars = new HashMap<>();
        int left = 0;
        int right = 0;
        final StringBuilder current = new StringBuilder();
        while (left <= right && right < s.length()) {
            uniqueChars.merge(s.charAt(right), 1, Integer::sum);
            current.append(s.charAt(right));
            right++;
            while (current.length() > maxSize || current.length() > minSize || uniqueChars.size() > maxLetters) {
                if (uniqueChars.computeIfPresent(s.charAt(left), (key, oldValue) -> oldValue - 1) == 0) {
                    uniqueChars.remove(s.charAt(left));
                }
                current.deleteCharAt(0);
                left++;
            }
            if (current.length() >= minSize && current.length() <= maxSize) {
                uniqueChars.size();
                subStringOccurances.merge(current.toString(), 1, Integer::sum);
            }
        }
        return subStringOccurances.values().stream().mapToInt(value -> value).max().orElse(0);
    }
}
