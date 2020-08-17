package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TopKElementsTestCase {

    private TopKElements alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new TopKElements();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.alg.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2),
                new int[]{2, 1}
        );
    }
}
