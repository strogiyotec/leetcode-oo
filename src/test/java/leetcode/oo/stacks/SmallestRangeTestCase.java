package leetcode.oo.stacks;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SmallestRangeTestCase {

    private SmallestRange alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SmallestRange();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new int[]{20,24},
            this.alg.smallestRange(
                List.of(
                    List.of(4, 10, 15, 24, 26),
                    List.of(0, 9, 12, 20),
                    List.of(5, 18, 22, 30)
                )
            )
        );
    }
}
