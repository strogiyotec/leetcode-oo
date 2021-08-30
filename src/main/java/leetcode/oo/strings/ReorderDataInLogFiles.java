package leetcode.oo.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/reorder-data-in-log-files/
public final class ReorderDataInLogFiles {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ReorderDataInLogFiles().reorderLogFiles(
            new String[]{
                "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"
            }
        )));
    }

    public String[] reorderLogFiles(final String[] logs) {
        final List<String> digits = new LinkedList<>();
        final List<String> letters = new LinkedList<>();
        for (final String log : logs) {
            if (this.isLetters(log)) {
                letters.add(log);
            } else {
                digits.add(log);
            }
        }
        letters.sort(Comparator.<String,String>comparing(o->o.substring(o.indexOf(' '))).thenComparing(o->o.split(" ")[0]));
        final String[] sorted = new String[logs.length];
        int index = 0;
        for (final String letter : letters) {
            sorted[index] = letter;
            index++;
        }
        for (final String digit : digits) {
            sorted[index] = digit;
            index++;
        }
        return sorted;
    }

    private boolean isLetters(final String log) {
        final String[] split = log.split(" ");
        for (int i = 1; i < split.length; i++) {
            final String word = split[i];
            for (int j = 0; j < word.length(); j++) {
                if (Character.isDigit(word.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
