package leetcode.oo.design;

//https://leetcode.com/problems/design-add-and-search-words-data-structure/
public final class WordDictionary {

    final Trie root;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        this.root = new Trie();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        Trie node = this.root;
        for (final char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new Trie();
            }
            node = node.children[c - 'a'];
        }
        node.isEnd = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return this.search(word, 0, this.root);
    }

    private boolean search(String word, int index, final Trie node) {
        if (index == word.length()) {
            return node.isEnd;
        }
        if (word.charAt(index) == '.') {
            for (final Trie child : node.children) {
                if (child != null && this.search(word, index + 1, child)) {
                    return true;
                }
            }
        } else {
            return node.children[word.charAt(index) - 'a'] != null && this.search(word,index+1,node.children[word.charAt(index)-'a']);
        }
        return false;
    }

    private static class Trie {
        final Trie[] children = new Trie[26];
        boolean isEnd;
    }

}
