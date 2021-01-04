package leetcode.oo.dp.backtracking;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/
final class UniqueSplitString {

    private int max;

    int maxUniqueSplit(final String str) {
        final Set<String> set = new HashSet<>(str.length());
        this.search(set, str, 0);
        return this.max;
    }

    private void search(final Set<String> set, final String str, final int index) {
        this.max = Math.max(this.max, set.size());
        for (int i = index; i < str.length(); i++) {
            final String sub = str.substring(index, i + 1);
            if (!set.contains(sub)) {
                set.add(sub);
                this.search(set, str, i + 1);
                set.remove(sub);
            }
        }
    }
}
