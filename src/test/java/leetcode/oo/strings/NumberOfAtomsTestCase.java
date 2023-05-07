package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfAtomsTestCase {

    private NumberOfAtoms alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new NumberOfAtoms();
    }

    @Test
    public void test(){
        Assert.assertEquals("K4N2O14S4",this.alg.countOfAtoms("K4(ON(SO3)2)2"));
    }
}
