package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class WordDictionaryTestCase {

    private WordDictionary alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new WordDictionary();
    }

    @Test
    public void test() {
        this.alg.addWord("bad");
        this.alg.addWord("dad");
        this.alg.addWord("mad");
        Assert.assertFalse(
            this.alg.search("pad")
        );
        Assert.assertTrue(
            this.alg.search(".ad")
        );
        Assert.assertTrue(
            this.alg.search("bad")
        );
        Assert.assertTrue(
            this.alg.search("b..")
        );
    }

    @Test
    public void test2() {
        this.alg.addWord("at");
        this.alg.addWord("and");
        this.alg.addWord("an");
        this.alg.addWord("add");
        Assert.assertFalse(
            this.alg.search(".")
        );
        Assert.assertFalse(this.alg.search(".at"));
        this.alg.addWord("bat");
        Assert.assertFalse(this.alg.search("b."));
        Assert.assertFalse(this.alg.search("."));
        Assert.assertTrue(this.alg.search(".at"));
        Assert.assertTrue(this.alg.search("an."));
        Assert.assertFalse(this.alg.search("a.d."));
        Assert.assertTrue(this.alg.search("a.d"));


    }

}
