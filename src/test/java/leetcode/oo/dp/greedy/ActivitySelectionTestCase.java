package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public final class ActivitySelectionTestCase {

    private ActivitySelection alg;

    @Before
    public void init() {
        this.alg = new ActivitySelection();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.optimal(
                        Arrays.asList(
                                new ActivitySelection.Interval(1, 2),
                                new ActivitySelection.Interval(3, 4),
                                new ActivitySelection.Interval(0, 6),
                                new ActivitySelection.Interval(5, 7),
                                new ActivitySelection.Interval(8, 9),
                                new ActivitySelection.Interval(5, 9)
                        )
                ),
                Arrays.asList(
                        new ActivitySelection.Interval(1, 2),
                        new ActivitySelection.Interval(3, 4),
                        new ActivitySelection.Interval(5, 7),
                        new ActivitySelection.Interval(8, 9)
                )
        );
    }
}
