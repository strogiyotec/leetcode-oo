package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UniqueEmailsTestCase {

    private UniqueEmails alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new UniqueEmails();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.numUniqueEmails(
                new String[]{
                    "test.email+alex@leetcode.com", "test.email.leet+alex@code.com"
                }
            )
        );
        Assert.assertEquals(
            3,
            this.alg.numUniqueEmails(
                new String[]{
                    "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"
                }
            )
        );
        Assert.assertEquals(
            2,
            this.alg.numUniqueEmails(
                new String[]{
                    "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"
                }
            )
        );
    }
}
