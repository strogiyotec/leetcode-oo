package leetcode.amazon;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PromotionTestCase {

    private Promotion alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Promotion();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1,
            this.alg.promotionCheck(
                List.of(
                    List.of("apple", "apple"),
                    List.of("apple", "apple", "banana")
                ),
                List.of("apple", "apple", "apple", "banana")
            )
        );
        Assert.assertEquals(
            1,
            this.alg.promotionCheck(
                List.of(
                    List.of("apple", "apple"),
                    List.of("banana", "anything", "banana")
                ),
                List.of("orange", "apple", "apple", "banana", "orange", "banana")
            )
        );
    }
}
