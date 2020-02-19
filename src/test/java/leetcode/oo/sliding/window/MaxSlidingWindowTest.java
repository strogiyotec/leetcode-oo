package leetcode.oo.sliding.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test max sliding window.
 */
public final class MaxSlidingWindowTest {

    /**
     * Alg to test.
     */
    private final MaxSlidingWindow maxSlidingWindow =
            new MaxSlidingWindow();

    /**
     * Max sliding window test.
     */
    @Test
    public void maxSlidingWindow() {
        Assert.assertThat(
                this.maxSlidingWindow.maxSlidingWindow(
                        new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3
                ),
                CoreMatchers.is(new int[]{3, 3, 5, 5, 6, 7})
        );
        Assert.assertThat(
                this.maxSlidingWindow.maxSlidingWindow(
                        new int[]{1, 3, 1, 2, 0, 5}, 3
                ),
                CoreMatchers.is(new int[]{3, 3, 2, 5})
        );
        Assert.assertThat(
                this.maxSlidingWindow.maxSlidingWindow(
                        new int[0], 0
                ),
                CoreMatchers.is(new int[0])
        );
    }
}