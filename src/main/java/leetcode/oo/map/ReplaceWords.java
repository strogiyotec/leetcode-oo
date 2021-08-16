package leetcode.oo.map;

import java.util.List;

//https://leetcode.com/problems/replace-words/
final class ReplaceWords {

    private Trie root = new Trie();

    String replaceWords(List<String> dictionary, String sentence) {
        dictionary.forEach(this::addWord);
        final StringBuilder builder = new StringBuilder(sentence.length());
        final String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            final String word = words[i];
            builder.append(this.findWord(word));
            if (i < words.length - 1){
                builder.append(' ');
            }
        }
        return builder.toString();
    }

    private String findWord(final String word) {
        Trie current = this.root;
        for (int i = 0; i < word.length(); i++) {
            if (current.nodes[word.charAt(i) - 'a'] == null) {
                return word;
            }
            if (current.nodes[word.charAt(i) - 'a'].isEnd) {
                return word.substring(0, i + 1);
            }
            current = current.nodes[word.charAt(i) - 'a'];
        }
        return word;
    }

    private void addWord(final String word) {
        Trie current = this.root;
        for (final char c : word.toCharArray()) {
            if (current.nodes[c - 'a'] == null) {
                current.nodes[c - 'a'] = new Trie();
            }
            current = current.nodes[c - 'a'];
        }
        current.isEnd = true;
    }

    private static class Trie {
        boolean isEnd;
        ReplaceWords.Trie[] nodes;

        public Trie() {
            this.nodes = new Trie[26];
        }
    }
}
