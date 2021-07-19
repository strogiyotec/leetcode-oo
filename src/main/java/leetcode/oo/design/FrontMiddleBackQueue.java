package leetcode.oo.design;

import java.util.ArrayList;

//https://leetcode.com/problems/design-front-middle-back-queue/
public final class FrontMiddleBackQueue {

    private ArrayList<Integer> queue;

    public FrontMiddleBackQueue() {
        this.queue = new ArrayList<>();
    }

    public void pushFront(int val) {
        this.queue.add(0, val);
    }

    public void pushMiddle(int val) {
        this.queue.add(this.queue.size() / 2, val);
    }

    public void pushBack(int val) {
        this.queue.add(val);
    }

    public int popFront() {
        if (this.queue.isEmpty()) {
            return -1;
        } else {
            return this.queue.remove(0);
        }
    }

    public int popMiddle() {
        if (this.queue.isEmpty()) {
            return -1;
        }
        if (this.queue.size() % 2 == 0) {
            return this.queue.remove(this.queue.size() / 2 - 1);
        } else {
            return this.queue.remove(this.queue.size() / 2);
        }
    }

    public int popBack() {
        if (this.queue.isEmpty()) {
            return -1;
        } else {
            return this.queue.remove(this.queue.size() - 1);
        }
    }
}
