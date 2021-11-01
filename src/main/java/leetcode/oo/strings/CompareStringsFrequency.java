package leetcode.oo.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
public final class CompareStringsFrequency {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new CompareStringsFrequency().numSmallerByFrequency(
                    new String[]{"bba", "abaaaaaa", "aaaaaa", "bbabbabaab", "aba", "aa", "baab", "bbbbbb", "aab", "bbabbaabb"},
                    new String[]{"aaabbb", "aab", "babbab", "babbbb", "b", "bbbbbbbbab", "a", "bbbbbbbbbb", "baaabbaab", "aa"}

                )
            )
        );
    }

    public int[] numSmallerByFrequency(final String[] queries, final String[] words) {
        final int[] wordCnt = new int[words.length];
        int index = 0;
        for (final String word : words) {
            wordCnt[index] = this.minCount(word);
            index++;
        }
        Arrays.sort(wordCnt);
        final int[] result = new int[queries.length];
        index = 0;
        for (final String query : queries) {
            final int cnt = this.minCount(query);
            int left = 0;
            int right = wordCnt.length - 1;
            while (left <= right) {
                final int mid = (right - left) / 2 + left;
                final int midElement = wordCnt[mid];
                if (midElement <= cnt) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            result[index] = wordCnt.length - left;
            index++;
        }
        return result;
    }

    private int minCount(final String word) {
        char min = 'z';
        int cnt = 0;
        final Map<Character, Integer> charToCnt = new HashMap<>(word.length() << 1);
        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            final Integer currentCount = charToCnt.merge(c, 1, Integer::sum);
            if (min >=c) {
                min = c;
                cnt = currentCount;
            }
        }
        return cnt;
    }

}
