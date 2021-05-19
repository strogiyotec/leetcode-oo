package leetcode.oo.strings;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class EvaluateBracketsTestCase {

    private EvaluateBrackets alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new EvaluateBrackets();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "bobistwoyearsold",
            this.alg.evaluate(
                "(name)is(age)yearsold",
                Arrays.asList(
                    Arrays.asList("name", "bob"),
                    Arrays.asList("age", "two")
                )
            )
        );
        Assert.assertEquals(
            "hi?",
            this.alg.evaluate(
                "hi(name)",
                Collections.singletonList(
                    Arrays.asList("a", "b")
                )
            )
        );
    }
}
