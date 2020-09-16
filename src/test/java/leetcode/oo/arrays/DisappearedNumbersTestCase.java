package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public final class DisappearedNumbersTestCase {
    private DisappearedNumbers alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DisappearedNumbers();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.findDisappearedNumbers(
                        new int[]{
                                2, 2
                        }
                ),
                Collections.singletonList(1)
        );
        Assert.assertEquals(
                this.alg.findDisappearedNumbers(
                        new int[]{
                                1, 1, 2, 2
                        }
                ),
                Arrays.asList(3, 4)
        );
        Assert.assertEquals(
                this.alg.findDisappearedNumbers(
                        new int[]{
                                1, 1
                        }
                ),
                Collections.singletonList(2)
        );
        Assert.assertEquals(
                this.alg.findDisappearedNumbers(
                        new int[]{
                                4, 3, 2, 7, 8, 2, 3, 1
                        }
                ),
                Arrays.asList(5, 6)
        );
    }
}
