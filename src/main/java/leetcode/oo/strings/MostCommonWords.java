package leetcode.oo.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/most-common-word/
public final class MostCommonWords {

    public static void main(String[] args) {
        System.out.println(new MostCommonWords().mostCommonWord(
            "abc abc? abcd the jeff!",
            new String[]{"abc", "abcd", "jeff"}
        ));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        final Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        int max = 0;
        String word = null;
        final String[] parts = paragraph.split("\\W+");
        final Map<String, Integer> map = new HashMap<>(parts.length << 1);
        for (final String part : parts) {
            final String cleaned = part.toLowerCase(Locale.ENGLISH);
            if (!bannedSet.contains(cleaned)) {
                final Integer sum = map.merge(cleaned, 1, Integer::sum);
                if (sum > max) {
                    max = sum;
                    word = cleaned;
                }
            }
        }
        return word;
    }
}
