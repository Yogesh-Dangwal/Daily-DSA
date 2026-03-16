package BinaryTree.MaximumSumOfNonAdjacentNodes;

public class MaximumSumOfNonAdjacentNodes {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static int maxSum(Node root) {
        if (root == null) {
            return 0;
        }

        int include = root.data;

        if (root.left != null) {
            include += maxSum(root.left.left) + maxSum(root.left.right);
        }

        if (root.right != null) {
            include += maxSum(root.right.left) + maxSum(root.right.right);
        }

        int exclude = maxSum(root.left) + maxSum(root.right);
        
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(10);
        root.left.right = new Node(6);
        root.left.right.left = new Node(12);

        int result = maxSum(root);
        System.out.println("Maximum sum of non-adjacent nodes: " + result);
    }
}