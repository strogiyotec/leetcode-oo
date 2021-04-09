package leetcode.oo.map;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//https://leetcode.com/problems/replace-words/
final class ReplaceWords {

    String replaceWords(List<String> dictionary, String sentence) {
        final Set<String> setDictonary = new HashSet<>(dictionary);
        final Set<Integer> lengths = new TreeSet<>();
        for (final String word : dictionary) {
            lengths.add(word.length());
        }
        final StringBuilder builder = new StringBuilder(sentence.length());
        for (final String word : sentence.split(" ")) {
            boolean found = false;
            for (final Integer length : lengths) {
                if (word.length() >= length) {
                    final String root = word.substring(0, length);
                    if (setDictonary.contains(root)) {
                        if (builder.length() == 0) {
                            builder.append(root);
                        } else {
                            builder.append(' ').append(root);
                        }
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                if (builder.length() == 0) {
                    builder.append(word);
                } else {
                    builder.append(' ').append(word);
                }
            }
        }
        return builder.toString();
    }
}
