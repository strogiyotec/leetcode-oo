package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Test;

public final class BrowserHistoryTestCase {

    @Test
    public void test() {
        final BrowserHistory browser = new BrowserHistory("leetcode");
        browser.visit("google");
        browser.visit("facebook");
        browser.visit("youtube");
        Assert.assertEquals("facebook", browser.back(1));
        Assert.assertEquals("google", browser.back(1));
        Assert.assertEquals("facebook", browser.forward(1));
        browser.visit("linkedin");
        Assert.assertEquals("linkedin", browser.forward(2));
        Assert.assertEquals("google", browser.back(2));
        Assert.assertEquals("leetcode", browser.back(7));

    }
}
