package leetcode.oo.map;

import java.util.List;

//https://leetcode.com/problems/replace-words/
final class ReplaceWords {

    private Trie root = new Trie();

    String replaceWords(List<String> dictionary, String sentence) {
        dictionary.forEach(this::addWord);
        final StringBuilder shortSentence = new StringBuilder();
        final String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            final String shortened = this.find(words[i]);
            shortSentence.append(shortened);
            if (i != words.length - 1) {
                shortSentence.append(' ');
            }
        }
        return shortSentence.toString();
    }

    private String find(final String word) {
        final StringBuilder shortened = new StringBuilder();
        Trie current = this.root;
        for (int i = 0; i < word.length(); i++) {
            final int index = word.charAt(i) - 'a';
            if (current.nodes[index] == null) {
                return word;
            }
            current = current.nodes[index];
            shortened.append(word.charAt(i));
            if (current.isEnd) {
                return shortened.toString();
            }
        }
        return word;
    }

    private void addWord(final String word) {
        Trie current = this.root;
        for (int i = 0; i < word.length(); i++) {
            final int index = word.charAt(i) - 'a';
            if (current.nodes[index] == null) {
                current.nodes[index] = new Trie();
            }
            current = current.nodes[index];
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
