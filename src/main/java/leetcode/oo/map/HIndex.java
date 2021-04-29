package leetcode.oo.map;

//https://leetcode.com/problems/h-index/
final class HIndex {

    int hIndex(final int[] citations) {
        final int[] cache = new int[citations.length + 1];
        for (final int citation : citations) {
            if (citation >= citations.length) {
                cache[citations.length]++;
            } else {
                cache[citation]++;
            }
        }
        int cnt = 0;
        for (int i = citations.length; i >= 0; i--) {
            cnt += cache[i];
            if (cnt >= i) {
                return i;
            }
        }
        return 0;
    }
}
