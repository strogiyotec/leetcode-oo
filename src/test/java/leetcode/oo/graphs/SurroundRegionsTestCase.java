package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SurroundRegionsTestCase {

    private SurroundRegions alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SurroundRegions();
    }

    @Test
    public void test() {
        final char[][] board = {
                "XXXX".toCharArray(),
                "XOOX".toCharArray(),
                "XXOX".toCharArray(),
                "XOXX".toCharArray()
        };
        this.alg.solve(board);
        Assert.assertArrayEquals(
                board,
                new char[][]{
                        "XXXX".toCharArray(),
                        "XXXX".toCharArray(),
                        "XXXX".toCharArray(),
                        "XOXX".toCharArray()
                }
        );
    }

    @Test
    public void test2() {
        final char[][] board = {
                "OOO".toCharArray(),
                "OOO".toCharArray(),
                "OOO".toCharArray(),
        };
        this.alg.solve(board);
        Assert.assertArrayEquals(
                board,
                new char[][]{
                        "OOO".toCharArray(),
                        "OOO".toCharArray(),
                        "OOO".toCharArray()
                }
        );
    }
}
