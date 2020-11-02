package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class EditDistanceTestCase {

    private EditDistance alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new EditDistance();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3L,
            (long) this.alg.minDistance(
                "SITTING",
                "KITTEN"
            )
        );
    }
}
