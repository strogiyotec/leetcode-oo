package leetcode.oo.dp.dfs;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PyramidTransitionTestCase {

    private PyramidTransitionMatrix alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PyramidTransitionMatrix();
    }

    @Test
    public void test() {
        Assert.assertFalse(
            this.alg.pyramidTransition(
                "AAAA",
                List.of("AAB", "AAC", "BCD", "BBE", "DEF")

            )
        );
        Assert.assertTrue(
            this.alg.pyramidTransition(
                "BCD",
                List.of("BCC", "CDE", "CEA", "FFF")
            )
        );
    }
}
