package BST;/*
    @author jadon
*/

import com.sun.source.tree.Tree;

public class User {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        MyBst bst = new MyBst();
        bst.addNode(root,11);
        bst.addNode(root, 19);
        bst.addNode(root, 2);
        bst.addNode(root, 41);
        bst.addNode(root, 4);
        bst.addNode(root, 12);
        bst.addNode(root, 69);
        bst.addNode(root, 21);
        bst.addNode(root, 1);
        bst.addNode(root, 14);
        bst.inorder(root);
    }
}
