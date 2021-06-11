package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/number-of-matching-subsequences/
public final class MatchingSubseq {

    public static void main(String[] args) {
        System.out.println(
            new MatchingSubseq().numMatchingSubseq(
                "dsahjpjauf",
                new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}
            )
        );
        System.out.println(
            new MatchingSubseq().numMatchingSubseq(
                "abcde",
                new String[]{"a", "bb", "acd", "ace"}
            )
        );
    }

    public int numMatchingSubseq(final String s, final String[] words) {
        final Map<Character, List<Integer>> charToPos = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            charToPos.putIfAbsent(s.charAt(i), new ArrayList<>());
            charToPos.get(s.charAt(i)).add(i);
        }
        int cnt = 0;
        for (final String word : words) {
            final Map<Character, Set<Integer>> cache = new HashMap<>();
            int matchedCnt = 0;
            int prevPos = -1;
            for (int i = 0; i < word.length(); i++) {
                final char c = word.charAt(i);
                if (charToPos.containsKey(c)) {
                    for (final Integer position : charToPos.getOrDefault(c, Collections.emptyList())) {
                        if (position > prevPos && (!cache.containsKey(c) || !cache.get(c).contains(position))) {
                            prevPos = position;
                            cache.putIfAbsent(c, new HashSet<>());
                            cache.get(c).add(position);
                            matchedCnt++;
                            break;
                        }
                    }
                }
            }
            if (matchedCnt == word.length()) {
                cnt++;
            }
        }
        return cnt;
    }
}
