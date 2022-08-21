package leetcode.oo.math;

import java.util.Arrays;

//https://leetcode.com/problems/count-words-obtained-after-adding-a-letter/
public final class CountWordsAfterAddingLetter {

    public int wordCount(final String[] startWords, final String[] targetWords) {
        final Trie trie = new Trie();
        //n * nLogn = n^2Log(n)
        for (final String currentWord : startWords) {
            final char[] chars = currentWord.toCharArray();
            Arrays.sort(chars);
            final String sortedWord = new String(chars);
            trie.add(sortedWord);
        }
        int cnt = 0;
        //n
        for (final String targetWord : targetWords) {
            final char[] chars = targetWord.toCharArray();
            //nLogN
            Arrays.sort(chars);
            final String sorted = new String(chars);
            for (int i = 0; i < sorted.length(); i++) {
                //n
                final String sub = sorted.substring(0, i) + sorted.substring(i + 1);
                //n
                if (trie.exists(sub)) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;

    }

    private static class Trie {

        private Node root;

        Trie() {
            this.root = new Node();
        }

        public boolean exists(final String str) {
            Node node = this.root;
            for (int i = 0; i < str.length() && node != null; i++) {
                final int index = str.charAt(i) - 'a';
                node = node.children[index];
            }
            return node != null && node.isEnd;
        }

        public void add(final String word) {
            Node node = this.root;
            for (int i = 0; i < word.length(); i++) {
                final int index = word.charAt(i) - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Node();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }
    }

    private static class Node {
        private Node[] children;

        private boolean isEnd;

        Node() {
            this.children = new Node[26];
            this.isEnd = false;
        }
    }
}
