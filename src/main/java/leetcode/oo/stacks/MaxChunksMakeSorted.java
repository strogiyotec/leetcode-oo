package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/max-chunks-to-make-sorted/
public final class MaxChunksMakeSorted {

    public int maxChunksToSorted(final int[] arr) {
        final Stack<Integer> stack = new Stack<>();
        for (final int num : arr) {
            int largest = num;
            while(!stack.isEmpty() && stack.peek() > num){
                largest = Math.max(
                    largest,
                    stack.pop()
                );
            }
            stack.push(largest);
        }
        return stack.size();
    }
}
