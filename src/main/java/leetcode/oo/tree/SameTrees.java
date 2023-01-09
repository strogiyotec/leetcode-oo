package leetcode.oo.tree;

final class SameTrees {

    boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p.value() != q.value()){
            return false;
        }
        return this.isSameTree(p.left(),q.left())
                && this.isSameTree(p.right(),q.right());
    }
}
