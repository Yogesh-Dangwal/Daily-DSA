package Tree.SmallestSubtreeWithAllDeepestNodes;

public class SmallestSubtreeWithAllDeepestNodes {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Pair {
        TreeNode node;
        int depth;

        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public static TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    private static Pair dfs(TreeNode node) {
        if (node == null) {
            return new Pair(null, 0);
        }

        Pair left = dfs(node.left);
        Pair right = dfs(node.right);

        if (left.depth > right.depth) {
            return new Pair(left.node, left.depth + 1);
        } else if (right.depth > left.depth) {
            return new Pair(right.node, right.depth + 1);
        } else {
            return new Pair(node, left.depth + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode result = subtreeWithAllDeepest(root);
        System.out.println(result.val);
    }
}
