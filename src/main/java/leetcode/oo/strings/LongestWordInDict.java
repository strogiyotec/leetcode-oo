package leetcode.oo.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-word-in-dictionary/
public final class LongestWordInDict {

    public static void main(String[] args) {
        System.out.println(new LongestWordInDict().longestWord(
            new String[]{
                "b", "br", "bre", "brea", "break", "breakf", "breakfa", "breakfas", "breakfast", "l", "lu", "lun", "lunc", "lunch", "d", "di", "din", "dinn", "dinne", "dinner"
            }
        ));
    }

    public String longestWord(String[] words) {
        Arrays.sort(
            words,
            (o1, o2) -> {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return Integer.compare(o1.length(), o2.length());
            }
        );
        final Set<String> set = new HashSet<>(words.length << 2, 1.0f);
        String longest = "";
        for (final String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                if (longest.length() < word.length()) {
                    longest = word;
                }
            }
        }
        return longest;
    }

}
