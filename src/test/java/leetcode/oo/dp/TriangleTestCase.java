package leetcode.oo.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TriangleTestCase {

    private Triangle alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new Triangle();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            11,
            this.alg.minimumTotal(
                Arrays.asList(
                    new ArrayList<>(Collections.singletonList(2)),
                    new ArrayList<>(Arrays.asList(3, 4)),
                    new ArrayList<>(Arrays.asList(6, 5, 10)),
                    new ArrayList<>(Arrays.asList(4, 1, 8, 3))
                )
            )
        );
        Assert.assertEquals(
            -10,
            this.alg.minimumTotal(
                Arrays.asList(
                    new ArrayList<>(Arrays.asList(-10))
                )
            )
        );
    }
}
