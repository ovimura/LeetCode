
import java.util.Random;
import java.util.regex.Pattern;

public class BinaryTree {

    // Node class represents each node in the tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root; // Root node of the tree

    // Constructor for an empty tree
    BinaryTree() {
        root = null;
    }

    // Inserts a new node with the given data
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive helper function for insertion
    Node insertRec(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }

        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        }

        return node;
    }

    // Inorder traversal: Left - Root - Right
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }

    // Preorder traversal: Root - Left - Right
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    // Postorder traversal: Left - Right - Root
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.print(node.data + " ");
        }
    }
	
	
    
    
    
    
    
	
	
	void generateRandomTree() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            insert(random.nextInt(1000));
        }
    }

    // Reverses the tree in-place
    void reverse() {
        reverseRec(root);
    }

    // Helper function for reversing
    void reverseRec(Node node) {
        if (node == null) {
            return;
        }

        // Swap left and right children
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively reverse left and right subtrees
        reverseRec(node.left);
        reverseRec(node.right);
    }
	
	
    public static void main(String [] args) {
    	BinaryTree tree = new BinaryTree();
    	tree.generateRandomTree(); // Create a tree with 100 nodes

    	System.out.println("Original tree:");
    	tree.inorder();

    	tree.reverse();

    	System.out.println("\nReversed tree:");
    	tree.inorder();
    	
    	Pattern.compile("\\s+").matcher("");)
    }
    
    
}

