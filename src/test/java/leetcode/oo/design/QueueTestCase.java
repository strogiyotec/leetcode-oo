package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class QueueTestCase {

    private FrontMiddleBackQueue queue;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.queue = new FrontMiddleBackQueue();
    }

    @Test
    public void test() {
        this.queue.pushFront(1);
        this.queue.pushBack(2);
        this.queue.pushMiddle(3);
        this.queue.pushMiddle(4);
        Assert.assertEquals(
            1,
            this.queue.popFront()
        );
        Assert.assertEquals(
            3,
            this.queue.popMiddle()
        );
        Assert.assertEquals(
            4,
            this.queue.popMiddle()
        );
        Assert.assertEquals(
            2,
            this.queue.popBack()
        );
        Assert.assertEquals(
            -1,
            this.queue.popFront()
        );
    }
}
