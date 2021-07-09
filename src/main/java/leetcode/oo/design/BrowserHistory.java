package leetcode.oo.design;

import java.util.ArrayList;

public final class BrowserHistory {

    private final ArrayList<String> list = new ArrayList<>(16);

    int nextPosition;

    public BrowserHistory(String homepage) {
        this.list.add(homepage);
    }

    public void visit(String url) {
        this.list.subList(this.nextPosition + 1, this.list.size()).clear();
        this.list.add(url);
        this.nextPosition++;
        this.list.trimToSize();
    }

    public String back(final int steps) {
        this.nextPosition = Math.max(this.nextPosition - steps, 0);
        return this.list.get(this.nextPosition);
    }

    public String forward(final int steps) {
        this.nextPosition = Math.min(this.nextPosition + steps, this.list.size() - 1);
        return this.list.get(this.nextPosition);
    }
}
