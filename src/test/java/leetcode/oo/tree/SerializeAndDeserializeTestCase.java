package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SerializeAndDeserializeTestCase {

    private SerializeAndDeser alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SerializeAndDeser();
    }

    @Test
    public void test(){
        final String line = "1,2,3,null,null,4,5";
        final PlainTree tree = this.alg.deserialize(line);
        Assert.assertEquals(line,this.alg.serialize(tree));
    }
}
