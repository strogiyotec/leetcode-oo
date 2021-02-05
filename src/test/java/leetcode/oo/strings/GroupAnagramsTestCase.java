package leetcode.oo.strings;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class GroupAnagramsTestCase {

    private GroupAnagrams alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new GroupAnagrams();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                Collections.singletonList("bat")
            ),
            this.alg.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})
        );
    }
}
