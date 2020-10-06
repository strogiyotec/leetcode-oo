package leetcode.oo.window;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DnaSeqTestCase {

    private DnaSeq alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DnaSeq();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList("AAAAACCCCC", "CCCCCAAAAA"),
            this.alg.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")
        );
    }
}
