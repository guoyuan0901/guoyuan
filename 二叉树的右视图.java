package day14;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class 二叉树的右视图 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        getRightNode(root,res,0);
        return res;
    }

    //每层取最右边的元素
    private void getRightNode(TreeNode root,List<Integer> res,int depth){
        if(root == null) return;
        if(depth == res.size()){
            res.add(root.val);
        }
        //优先遍历右边
        getRightNode(root.right,res,depth+1);
        getRightNode(root.left,res,depth+1);
    }
}
