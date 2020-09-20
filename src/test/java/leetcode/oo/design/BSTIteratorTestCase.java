package leetcode.oo.design;

import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BSTIteratorTestCase {

    private BSTIterator iterator;

    /**
     * Init.
     */
    @Before
    public void init() {
        final PlainTree plainTree = new PlainTree(7);
        plainTree.left = new PlainTree(3);
        plainTree.right = new PlainTree(15);
        plainTree.right.left = new PlainTree(9);
        plainTree.right.right = new PlainTree(20);
        this.iterator = new BSTIterator(plainTree);
    }

    @Test
    public void test() {
        this.iterator.next();
        this.iterator.next();
        this.iterator.hasNext();
        this.iterator.next();
        this.iterator.hasNext();
        this.iterator.next();
        this.iterator.hasNext();
        this.iterator.next();
        Assert.assertFalse(this.iterator.hasNext());
    }
}
