package leetcode.oo.design;

/**
 * Trie.
 * See {@link <a href ="https://leetcode.com/problems/implement-trie-prefix-tree/">https://leetcode.com/problems/implement-trie-prefix-tree/</a>}
 */
final class Trie {

    private final Node root;

    /**
     * Initialize your data structure here.
     */
    Trie() {
        this.root = new Node();
    }

    /**
     * Inserts a word into the trie.
     */
    void insert(String word) {
        Node current = this.root;
        for (int i = 0; i < word.length(); i++) {
            final int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.finished = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    boolean search(String word) {
        final Node node = this.incrementalSearch(word);
        return node != null && node.finished;
    }

    private Node incrementalSearch(final String word) {
        Node current = this.root;
        for (int i = 0; i < word.length(); i++) {
            final int index = word.charAt(i) - 'a';
            if (current.children[index] == null) return null;
            current = current.children[index];
        }
        return current;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    boolean startsWith(String prefix) {
        final Node node = this.incrementalSearch(prefix);
        return node != null;
    }

    static class Node {
        private final Node[] children = new Node[26];

        private boolean finished = false;
    }
}
