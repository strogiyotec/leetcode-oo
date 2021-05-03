package leetcode.oo.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FlatternNestedListTestCase {

    private List<NestedInteger> list;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.list =
            new ArrayList<>(
                Arrays.asList(
                    new NestedIntegerImpl(1),
                    new NestedIntegerImpl(
                        new ArrayList<>(
                            Arrays.asList(
                                new NestedIntegerImpl(4),
                                new NestedIntegerImpl(
                                    new ArrayList<>(
                                        Arrays.asList(
                                            new NestedIntegerImpl(6),
                                            new NestedIntegerImpl(2),
                                            new NestedIntegerImpl(
                                                new ArrayList<>(
                                                    Arrays.asList(
                                                        new NestedIntegerImpl(8),
                                                        new NestedIntegerImpl(9)
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            );
    }

    @Test
    public void test() {
        final List<Integer> fetched = new ArrayList<>();
        final NestedIterator iterator = new NestedIterator(this.list);
        while(iterator.hasNext()){
            fetched.add(iterator.next());
        }
        Assert.assertEquals(
            Arrays.asList(1,4,6,2,8,9),
            fetched
        );
    }
}
