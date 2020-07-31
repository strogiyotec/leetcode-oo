package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Test;

public final class LRUCacheTestCase {

    @Test
    public void test() {
        final LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(cache.get(1), 1);
        //should delete 2 as it's least recently used
        cache.put(3, 3);
        Assert.assertEquals(cache.get(2), -1);
        //should delete 1 as it's least recently used
        cache.put(4, 4);
        Assert.assertEquals(cache.get(1), -1);

        Assert.assertEquals(cache.get(3), 3);
        Assert.assertEquals(cache.get(4), 4);
    }
}
