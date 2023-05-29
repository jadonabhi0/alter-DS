package BST;/*
    @author jadon
*/


import com.sun.source.tree.Tree;

/**
 * This class contains the implementations of binary Search tree
 */

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.left = null;
        this.right = null;
        this.val = val;
    }
}

public class MyBst {

    private TreeNode root;
    public MyBst(){
        this.root = null;
    }

//
//    public TreeNode buildTree(TreeNode root, int[] array, int lo, int hi){
//        if (lo>=hi) return null;
//        int mid = (lo+hi)/2;
//        if(root == null) return new TreeNode(array[mid]);
//        root.left = buildTree(root.left, array,0, hi-1);
//        root.right = buildTree(root.right, array,lo+1, hi);
//        return root;
//    }

    public TreeNode addNode(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }else if(val > root.val){
            root.right = addNode(root.right, val);
        }else if(val < root.val){
            root.left = addNode(root.left, val);
        }else{
            // do nothing chill
        }
        return root;
    }


    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }




}
