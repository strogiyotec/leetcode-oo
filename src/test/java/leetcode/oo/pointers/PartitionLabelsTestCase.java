package leetcode.oo.pointers;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PartitionLabelsTestCase {

    private PartitionLabels alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PartitionLabels();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList(9,7,8),
            this.alg.partitionLabels("ababcbacadefegdehijhklij")
        );
        Assert.assertEquals(
            Arrays.asList(1,9),
            this.alg.partitionLabels("caedbdedda")
        );
    }
}
