package leetcode.oo.pointers;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link ContainerArea}.
 */
public final class ContainerAreaTest {

    /**
     * Alg to test.
     */
    private ContainerArea alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ContainerArea();
    }

    /**
     * Test that max area is correct.
     */
    @Test
    public void testContainerArea() {
        Assert.assertThat(
                this.alg.maxArea(
                        new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}
                ),
                CoreMatchers.is(49)
        );
    }
}
