package test;

public class BinaryTreeMirroring {


    private static void swap(Node root){
        if(root == null)
            return;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    private static void createMirrorBinaryTree(Node root){
        if(root == null){
            return;
        }
        createMirrorBinaryTree(root.left);
        createMirrorBinaryTree(root.right);
        swap(root);
    }

    private static void printInPreOrder(Node root){
        if(root == null)
            return;

        System.out.print(root.data + " ");
        printInPreOrder(root.left);
        printInPreOrder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(4);
        root.right = new Node(6);

        root.left.left = new Node(3);

        root.right.left = new Node(2);
        root.right.right = new Node(7);


        printInPreOrder(root);

        System.out.println();

        createMirrorBinaryTree(root);
        printInPreOrder(root);

    }
}

class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
    }
}
