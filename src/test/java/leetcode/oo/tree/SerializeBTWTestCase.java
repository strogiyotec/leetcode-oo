package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SerializeBTWTestCase {

    private SerializeBST alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SerializeBST();
    }

    @Test
    public void test(){
        final PlainTree tree = this.alg.deserialize("2 null 3");
        Assert.assertEquals(
            this.alg.serialize(tree).trim(),
            "2 null 3"
        );
    }
}
