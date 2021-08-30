package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//https://leetcode.com/problems/short-encoding-of-words/
public final class ShortEncodingOfWords {

    public static void main(final String[] args) {
        System.out.println(
            new ShortEncodingOfWords().minimumLengthEncoding(
                new String[]{
                    "time", "me", "bell"
                }
            )
        );
    }

    public int minimumLengthEncoding(final String[] words) {
        final Collection<String> strs = new ArrayList<>(words.length);
        Arrays.sort(words, (o1, o2) -> Integer.compare(o2.length(), o1.length()));
        int length = 0;
        for (final String word : words) {
            if (strs.isEmpty()) {
                strs.add(word);
                length += word.length();
            }
            boolean contain = false;
            for (final String str : strs) {
                if (str.endsWith(word)) {
                    contain = true;
                    break;
                }
            }
            if (!contain) {
                strs.add(word);
                length += word.length();
            }
        }
        return length + strs.size();
    }
}
