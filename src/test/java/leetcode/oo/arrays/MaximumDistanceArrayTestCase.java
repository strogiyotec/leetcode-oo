package leetcode.oo.arrays;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaximumDistanceArrayTestCase {

    public MaximumDistanceArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaximumDistanceArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.maxDistance(
                List.of(
                    List.of(1, 2, 3),
                    List.of(4, 5),
                    List.of(1, 2, 3)
                )
            )
        );
    }
}
