package leetcode.oo.design;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * LRU Cache.
 * See {@link <a href ="https://leetcode.com/problems/lru-cache/">https://leetcode.com/problems/lru-cache/</a>}
 */
final class LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    LRUCache(int capacity) {
        super(capacity + 2, 1, true);
        this.capacity = capacity;

    }

    int get(int key) {
        final Integer value = super.get(key);
        return value == null ? -1 : value;
    }

    void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(final Map.Entry<Integer, Integer> eldest) {
        return this.size() == this.capacity + 1;
    }
}
