package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfIslandsTestCase {

    private NumberOfIslands alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumberOfIslands();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.numIslands(
                        new char[][]{
                                {'1', '1', '1', '1', '0'},
                                {'1', '1', '0', '1', '0'},
                                {'1', '1', '0', '0', '0'},
                                {'0', '0', '0', '0', '0'},
                        }
                ),
                1
        );
    }

    @Test
    public void test2() {
        Assert.assertEquals(
                this.alg.numIslands(
                        new char[][]{
                                "11000".toCharArray(),
                                "11000".toCharArray(),
                                "00100".toCharArray(),
                                "00011".toCharArray()
                        }
                ),
                1
        );
    }

}
