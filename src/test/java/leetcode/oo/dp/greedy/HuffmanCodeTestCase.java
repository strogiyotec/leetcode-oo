package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class HuffmanCodeTestCase {

    private HuffmanCode alg;

    @Before
    public void init() {
        this.alg = new HuffmanCode();
    }

    @Test
    public void test() {
        final HuffmanCode.Node node = new HuffmanCode.Node(
                new HuffmanCode.Node(
                        new HuffmanCode.Node(null, null, 1, 'B'),
                        new HuffmanCode.Node(null, null, 1, 'C'),
                        2,
                        ' '
                ),
                new HuffmanCode.Node(null, null, 3, 'A'),
                5,
                ' '
        );
        Assert.assertEquals(
                this.alg.encode("ABACA", node),
                "1001011"
        );
        Assert.assertEquals(
                this.alg.decode("1001011", node),
                "ABACA"
        );
    }
}
