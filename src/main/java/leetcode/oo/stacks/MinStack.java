package leetcode.oo.stacks;

//https://leetcode.com/problems/min-stack/
public final class MinStack {

    public static void main(String[] args) {
        final MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-1);
        System.out.println(stack.getMin());

    }

    private Node root;

    public void push(int x) {
        if (this.root == null) {
            this.root = new Node(x, x, null);
        } else {
            this.root = new Node(x, Math.min(x, this.root.min), this.root);
        }

    }

    public void pop() {
        this.root = this.root.next;
    }

    public int top() {
        return this.root.value;
    }

    public int getMin() {
        return this.root.min;
    }

    private static class Node {
        final int value;
        final int min;
        final Node next;

        private Node(final int value, final int min, final Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }
}
