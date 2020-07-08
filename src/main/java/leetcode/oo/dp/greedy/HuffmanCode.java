package leetcode.oo.dp.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * Huffman code problem.
 * Check Introduction for algorithms
 * Greedy algorithms section
 */
final class HuffmanCode {

    String encode(final String line, final Node node) {
        final Map<Character, Integer> charsCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            final Character c = line.charAt(i);
            charsCount.putIfAbsent(c, 0);
            charsCount.computeIfPresent(c, (character, integer) -> ++integer);
        }
        final StringBuilder builder = new StringBuilder(line.length());
        Node temp = node;
        for (int i = 0; i < line.length(); i++) {
            final int charCount = charsCount.get(line.charAt(i));
            final char c = line.charAt(i);
            while (true) {
                if (temp.left.data == c) {
                    builder.append("0");
                    break;
                } else if (temp.right.data == c) {
                    builder.append("1");
                    break;
                } else {
                    if (temp.left.frequency < charCount) {
                        builder.append("1");
                        temp = temp.right;
                    } else {
                        builder.append("0");
                        temp = temp.left;
                    }
                }
            }
            temp = node;
        }
        return builder.toString();
    }


    String decode(final String line, final Node node) {
        final StringBuilder builder = new StringBuilder(line.length());
        Node temp = node;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1') {
                temp = temp.right;
                if (temp.right == null || temp.left == null) {
                    builder.append(temp.data);
                    temp = node;
                }
            } else {
                temp = temp.left;
                if (temp.right == null || temp.left == null) {
                    builder.append(temp.data);
                    temp = node;
                }
            }
        }
        return builder.toString();
    }

    static class Node {
        final Node left;
        final Node right;
        final int frequency;
        final char data;

        public Node(final Node left, final Node right, final int frequency, final char data) {
            this.left = left;
            this.right = right;
            this.frequency = frequency;
            this.data = data;
        }
    }
}
