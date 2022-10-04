package com.company;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTrees {

    Node root;

    BinaryTrees(int data) {
        root = new Node(data);
    }

    public void insert(int val, Node root) {
        boolean used = true;
        Node temp = root;
        while (used) {
            //Checks weather to place left or right depending on value (higher = right , lower = left)
            //Checks if left node is null, if not it will try to find next left null node.
            if (val < root.data && root.left == null) {
                root.left = new Node(val);
                used = false;
            }
            if (val < root.data && root.left != null) {
                root = root.left;
            }
            if (val > root.data && root.right == null) {
                root.right = new Node(val);
                used = false;

            }
            if (val > root.data && root.right != null) {
                root = root.right;
            }

        }
        this.root = temp;
    }

    public void preorder(Node root) {
        System.out.println(root.data);

        if (root.left != null) {
            preorder(root.left);
        }

        if (root.right != null) {
            preorder(root.right);
        }

    }

    public void inorder(Node root) {


        if (root.left != null) {
            inorder(root.left);
        }
        System.out.println(root.data);
        if (root.right != null) {
            inorder(root.right);
        }

    }

    public void postorder(Node root) {


        if (root.left != null) {
            postorder(root.left);
        }

        if (root.right != null) {
            postorder(root.right);
        }
        System.out.println(root.data);
    }

    public static void main(String[] args) {

        BinaryTrees bt = new BinaryTrees(2);
        /*
         bt.root.left =  new Node(3);
         bt.root.right = new Node(4);

         bt.root.left.left = new Node(1);
         bt.root.left.right = new Node(2);

         bt.root.right.left = new Node(3);
         bt.root.right.right = new Node( 4);


         */

        bt.insert(1, bt.root);
        bt.insert(0, bt.root);
        bt.insert(-1, bt.root);
        bt.insert(5, bt.root);
        bt.insert(3, bt.root);
        bt.insert(4, bt.root);
        //bt.preorder(bt.root);
        //bt.inorder(bt.root);
        bt.postorder(bt.root);
        System.out.println("EASY");

    }

}
