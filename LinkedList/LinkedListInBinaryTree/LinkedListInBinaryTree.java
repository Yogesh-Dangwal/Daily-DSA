package LinkedList.LinkedListInBinaryTree;
public class LinkedListInBinaryTree {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;

        if (checkPath(head, root)) return true;

        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private static boolean checkPath(ListNode head, TreeNode node) {
        if (head == null) return true;
        if (node == null) return false;
        if (head.val != node.val) return false;

        return checkPath(head.next, node.left) ||
               checkPath(head.next, node.right);
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(8);

        System.out.println(isSubPath(head, root));
    }
}