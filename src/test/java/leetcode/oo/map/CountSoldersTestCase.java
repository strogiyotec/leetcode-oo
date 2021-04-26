package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountSoldersTestCase {

    private CountSolders alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new CountSolders();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            3,
            this.alg.numTeams(
                new int[]{2, 5, 3, 4, 1}
            )
        );
    }
}
