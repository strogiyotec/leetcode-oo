package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CriticalNetworkTestCase {

    private CriticalNetwork alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CriticalNetwork();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Collections.singletonList(Arrays.asList(1, 3)),
            this.alg.criticalConnections(
                4,
                Arrays.asList(
                    Arrays.asList(0, 1),
                    Arrays.asList(1, 2),
                    Arrays.asList(2, 0),
                    Arrays.asList(1, 3)
                )
            )
        );
    }
}
