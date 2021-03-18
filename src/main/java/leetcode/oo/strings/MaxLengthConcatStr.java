package leetcode.oo.strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
final class MaxLengthConcatStr {

    private int max;

    int maxLength(List<String> arr) {
        this.dfs(arr, 0, "");
        return this.max;
    }

    private void dfs(final List<String> arr, final int index, final String word) {
        final Set<Character> set = new HashSet<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            if (!set.add(word.charAt(i))) {
                return;
            }
        }
        this.max = Math.max(this.max, word.length());
        for (int i = index; i < arr.size(); i++) {
            this.dfs(arr, i + 1, word + arr.get(i));
        }
    }
}
