package leetcode.oo.strings;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/number-of-atoms/description/
public final class NumberOfAtoms {

    public static void main(String[] args) {
        System.out.println(new NumberOfAtoms().countOfAtoms("K4(ON(SO3)2)2"));
    }

    public String countOfAtoms(String formula) {
        final Stack<Map<String, Integer>> stack = new Stack<>();
        final AtomicInteger index = new AtomicInteger(0);
        Map<String, Integer> currentMap = new TreeMap<>();
        while (index.get() < formula.length()) {
            if (formula.charAt(index.get()) == '(') {
                stack.push(currentMap);
                currentMap = new TreeMap<>();
                index.incrementAndGet();
            } else if (formula.charAt(index.get()) == ')') {
                index.incrementAndGet();
                final Map<String, Integer> parentMap = stack.pop();
                final int count = this.parseCount(formula, index);
                currentMap.forEach((atom, atomCnt) -> {
                    final int newCnt = atomCnt * count;
                    parentMap.merge(atom, newCnt, Integer::sum);
                });
                currentMap = parentMap;
            } else {
                final String atom = this.parseAtom(formula, index);
                if (!atom.isEmpty()) {
                    final int count = this.parseCount(formula, index);
                    currentMap.merge(atom, count, Integer::sum);
                }
            }
        }
        final StringBuilder solution = new StringBuilder(formula.length());
        currentMap.entrySet().forEach(entry -> {
            if (entry.getValue().equals(1)) {
                solution.append(entry.getKey());
            } else {
                solution.append(entry.getKey()).append(entry.getValue());
            }
        });
        return solution.toString();
    }

    private int parseCount(final String formula, final AtomicInteger index) {
        final StringBuilder builder = new StringBuilder(formula.length());
        while (index.get() < formula.length() && Character.isDigit(formula.charAt(index.get()))) {
            builder.append(formula.charAt(index.getAndIncrement()));
        }
        if (builder.length() == 0) {
            return 1;
        }
        return Integer.parseInt(builder.toString());
    }

    private String parseAtom(final String formula, final AtomicInteger index) {
        final StringBuilder builder = new StringBuilder(formula.length());
        builder.append(formula.charAt(index.getAndIncrement()));
        while (index.get() < formula.length() && Character.isLowerCase(formula.charAt(index.get()))) {
            builder.append(formula.charAt(index.getAndIncrement()));
        }
        return builder.toString();
    }
}
