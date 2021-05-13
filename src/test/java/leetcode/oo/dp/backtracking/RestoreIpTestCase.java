package leetcode.oo.dp.backtracking;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RestoreIpTestCase {

    private RestoreIpAddress alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new RestoreIpAddress();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            Arrays.asList("255.255.11.135","255.255.111.35"),
            this.alg.restoreIpAddresses("25525511135")
        );
        Assert.assertEquals(
            Collections.singletonList("0.0.0.0"),
            this.alg.restoreIpAddresses("0000")
        );
    }
}
