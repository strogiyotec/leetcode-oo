package leetcode.oo.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/implement-magic-dictionary/
public final class MagicDictionary {

    public static void main(String[] args) {
        final MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(
            new String[]{
                "hello", "hallo", "leetcode"
            }
        );
        System.out.println(magicDictionary.search("hello"));
        System.out.println(magicDictionary.search("hhllo"));
        System.out.println(magicDictionary.search("hell"));
        System.out.println(magicDictionary.search("leetcoded"));
    }

    private List<String> words = new ArrayList<>();

    public MagicDictionary() {
    }

    public void buildDict(String[] dictionary) {
        this.words.addAll(Arrays.asList(dictionary));
    }

    public boolean search(String searchWord) {
        for (final String word : this.words) {
            if (searchWord.length() != word.length()) {
                continue;
            }
            if (this.count(searchWord, word)) {
                return true;
            }
        }
        return false;
    }

    private boolean count(final String searchWord, final String word) {
        int cnt = 0;
        for (int i = 0; i < searchWord.length(); i++) {
            if (searchWord.charAt(i) != word.charAt(i)) {
                cnt++;
            }
            if (cnt == 2) {
                return false;
            }
        }
        return cnt != 0;
    }
}
