package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
public final class LongestWordDeleting {

    public static void main(String[] args) {
        System.out.println(
            new LongestWordDeleting().findLongestWord(
                "abce",
                new ArrayList<>(
                    List.of(
                        "abe", "abc"
                    )
                )
            )
        );
        System.out.println(
            new LongestWordDeleting().findLongestWord(
                "abpcplea",
                new ArrayList<>(
                    List.of(
                        "ale", "apple", "monkey", "plea"
                    )
                )
            )
        );
    }

    public String findLongestWord(
        final String s,
        final List<String> dictionary
    ) {
        dictionary.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return Integer.compare(o2.length(), o1.length());
            }
            return o1.compareTo(o2);
        });
        for (final String word : dictionary) {
            if (this.match(word, s)) {
                return word;
            }
        }
        return "";
    }

    private boolean match(final String word, final String line) {
        int wordIndex = 0;
        int lineIndex =0;
        while(wordIndex < word.length() && lineIndex < line.length()){
            if(word.charAt(wordIndex) == line.charAt(lineIndex)){
                lineIndex++;
                wordIndex++;
            } else{
                lineIndex++;
            }
        }
        return wordIndex == word.length();
    }

}
