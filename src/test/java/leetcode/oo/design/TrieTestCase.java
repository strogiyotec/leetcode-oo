package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Test;

public final class TrieTestCase {

    @Test
    public void test() {
        final Trie trie = new Trie();
        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));
        Assert.assertFalse(trie.search("app"));
        Assert.assertTrue(trie.startsWith("app"));
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));
    }
}
