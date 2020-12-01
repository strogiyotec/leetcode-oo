package leetcode.oo.tree.path;

import java.util.ArrayList;
import java.util.List;
import leetcode.oo.tree.PlainTree;

public final class BinaryTreePaths {

    public static void main(final String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.right = new PlainTree(5);
        System.out.println(new BinaryTreePaths().binaryTreePaths(tree));
    }

    public List<String> binaryTreePaths(PlainTree root) {
        final List<List<String>> paths = new ArrayList<>(16);
        this.paths(paths, new ArrayList<>(), root);
        final List<String> mapped = new ArrayList<>(paths.size());
        for (final List<String> path : paths) {
            mapped.add(String.join("->", path));
        }
        return mapped;
    }

    private void paths(final List<List<String>> paths, final List<String> currentPath, final PlainTree node) {
        if (node != null) {
            currentPath.add(String.valueOf(node.val));
            if (node.left == null && node.right == null) {
                paths.add(new ArrayList<>(currentPath));
                currentPath.remove(currentPath.size() - 1);
            } else {
                this.paths(paths, currentPath, node.left);
                this.paths(paths, currentPath, node.right);
                currentPath.remove(currentPath.size() - 1);
            }
        }
    }
}
