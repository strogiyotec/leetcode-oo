package leetcode.oo.design;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/flatten-nested-list-iterator/
public class NestedIterator implements Iterator<Integer> {

    private final Iterator<Integer> origin;

    public NestedIterator(final List<NestedInteger> list) {
        final Queue<Integer> queue = new LinkedList<>();
        for (final NestedInteger nestedInteger : list) {
            if (nestedInteger.isInteger()) {
                queue.add(nestedInteger.getInteger());
            } else {
                addElementToQueue(queue, nestedInteger);
            }
        }
        this.origin = queue.iterator();
    }

    private static void addElementToQueue(final Queue<Integer> queue, final NestedInteger list) {
        if (list.isInteger()) {
            queue.add(list.getInteger());
        } else {
            for (final NestedInteger nestedInteger : list.getList()) {
                addElementToQueue(queue, nestedInteger);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return this.origin.hasNext();
    }

    @Override
    public Integer next() {
        return this.origin.next();
    }

}

class NestedIntegerImpl implements NestedInteger {

    private final Object obj;

    NestedIntegerImpl(final Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean isInteger() {
        return this.obj instanceof Integer;
    }

    @Override
    public Integer getInteger() {
        return (Integer) this.obj;
    }

    @Override
    public List<NestedInteger> getList() {
        return (List<NestedInteger>) this.obj;
    }
}

interface NestedInteger {

    boolean isInteger();

    Integer getInteger();

    List<NestedInteger> getList();
}
