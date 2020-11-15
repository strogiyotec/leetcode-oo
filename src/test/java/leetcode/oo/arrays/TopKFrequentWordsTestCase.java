package leetcode.oo.arrays;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TopKFrequentWordsTestCase {

    private TopKFrequentWords alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new TopKFrequentWords();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList("i", "love"),
            this.alg.topKFrequent(
                new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2
            )
        );
    }
}
