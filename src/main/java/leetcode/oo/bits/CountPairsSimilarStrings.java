package leetcode.oo.bits;

import java.util.HashMap;
import java.util.Map;

public final class CountPairsSimilarStrings {

    public static void main(String[] args) {
        System.out.println(new CountPairsSimilarStrings().similarPairs(
            new String[]{
                "aba", "aabb", "abcd", "bac", "aabc"
            }
        ));
    }

    public int similarPairs(final String[] words) {
        int pairs = 0;
        final Map<Integer, Integer> cnt = new HashMap<>(words.length);
        for (final String word : words) {
            final int hash = this.hash(word);
            final Integer cachedCnt = cnt.getOrDefault(hash, 0);
            pairs += cachedCnt;
            cnt.merge(hash, 1, Integer::sum);
        }
        return pairs;
    }

    private int hash(final String word) {
        int hash = 0;
        for (int i = 0; i < word.length(); i++) {
            int letterAsInt = word.charAt(i) - 'a';
            hash |= 1 << letterAsInt;
        }
        return hash;
    }

}
