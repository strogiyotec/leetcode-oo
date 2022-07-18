package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Test;

public final class LongestPathDiffCharactersTestCase {

    @Test
    public void test() {
        Assert.assertEquals(
            new LongestPathWithDifferentCharacters().longestPath(new int[]{-1, 0, 0, 1, 1, 2}, "abacbe"),
            3
        );
    }

    @Test
    public void test2() {
        Assert.assertEquals(
            new LongestPathWithDifferentCharacters().longestPath(new int[]{-1, 0, 1}, "aab"),
            2
        );
    }
}
