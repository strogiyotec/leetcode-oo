package leetcode.oo.dp.dfs;

public final class SimilarStringGroup {

    public int numSimilarGroups(final String[] strs) {
        int cnt = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                final String currentWord = strs[i];

            }
        }
        return -1;
    }

    private boolean similar(final String first, final String second) {
        int unmatched = 0;
        int index = 0;
        while (index < first.length()) {
            if (first.charAt(index) != second.charAt(index)) {
                unmatched++;
            }
            index++;
        }
        return unmatched == 2;
    }
}
