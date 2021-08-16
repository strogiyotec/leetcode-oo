package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UniqueTreeIITestCase {

    private UniqueTreeII alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new UniqueTreeII();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            5,
            this.alg.generateTrees(3).size()
        );
    }
}
