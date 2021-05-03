package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RobotReturnOriginTestCase {

    private RobotReturnOrigin alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new RobotReturnOrigin();
    }

    @Test
    public void test(){
        Assert.assertFalse(
            this.alg.judgeCircle("RRDD")
        );
    }
}
