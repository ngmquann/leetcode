package learn.Tree;

import learn.oop.Parent;

import java.util.ArrayList;
import java.util.List;

public class MyBST {
    public TreeNode mRoot;

    public MyBST() {

    }
//    701. Insert into a Binary Search Tree
    public TreeNode insert(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
//        TH1: root == null
        if (root == null) {
            mRoot = newNode;
            return mRoot;
        } else {
//            TH2: root != null
            TreeNode tmp = root;
            while (true){
                if(val > tmp.val){
                    if(tmp.right == null){
                        tmp.right = newNode;
                        break;
                    } else {
                        tmp = tmp.right;
                    }
                } else{
                    if(tmp.left == null){
                        tmp.left = newNode;
                        break;
                    } else {
                        tmp = tmp.left;
                    }
                }
            }
            return root;
        }
    }

//    insert tree using recursion
    public TreeNode insertBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            if(root.right == null){
                root.right = new TreeNode(val);
            } else {
                insertBST(root.right, val);
            }
        } else {
            if(root.left == null){
                root.left = new TreeNode(val);
            } else {
                insertBST(root.left, val);
            }
        }

        return root;
    }

//    450. Delete Node in a BST
//    Tim node con trai cung cua node
    public TreeNode findLeftModeNode(TreeNode root) {
        if (root == null) return null;

        TreeNode left = root;
        while (left.left != null)
            left = left.left;
        return left;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

//        b1: tim note can xoa
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
//        b2: xoa node
//            TH1: node la'
            if (root.left == null && root.right == null) return null;
//            TH2.1: chi co 1 con ben trai
            if(root.left != null && root.right == null) return root.left;
//            TH2.2: chi co 1 con ben phai
            if(root.left == null && root.right != null) return root.right;
//            TH3: Ton tai 2 con
//            Tim node trai cung cua cay con ben phai
            TreeNode left = findLeftModeNode(root.right);
            root.val = left.val;
            root.right = deleteNode(root.right, left.val);
        }

        return root;
    }

//    700. Search in a Binary Search Tree
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        if(val < root.val){
            return searchBST(root.left, val);
        } else if(val > root.val){
            return searchBST(root.right, val);
        } else {
            return root;
        }
    }

//    Node - L - R
    public static void preOrder(TreeNode currentNode) {
        if (currentNode == null) return;
//        duyet currentNode truoc
        System.out.print(currentNode.val + " ");
//        duyet ben trai | duyet ben phai
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }

//    L - Node - R
    public static void inOrder(TreeNode currentNode) {
        if (currentNode == null) return;
        inOrder(currentNode.left);
        System.out.print(currentNode.val + " ");
        inOrder(currentNode.right);
    }

//    L - R - Node
    public static void postOrder(TreeNode currentNode) {
        if (currentNode == null) return;
        postOrder(currentNode.left);
        postOrder(currentNode.right);
        System.out.print(currentNode.val + " ");
    }

//    144. Binary Tree Preorder Traversal
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return result;
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }

//    94. Binary Tree Inorder Traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }

//    145. Binary Tree Postorder Traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return result;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        return result;
    }
}
