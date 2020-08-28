package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public final class WordSearch2TestCase {
    private WordSearch2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new WordSearch2();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.findWords(
                        new char[][]{
                                "oaan".toCharArray(),
                                "etae".toCharArray(),
                                "ihkr".toCharArray(),
                                "iflv".toCharArray()
                        }, new String[]{"oath", "pea", "eat", "rain"}
                ),
                Arrays.asList("oath","eat")
        );
    }
}
