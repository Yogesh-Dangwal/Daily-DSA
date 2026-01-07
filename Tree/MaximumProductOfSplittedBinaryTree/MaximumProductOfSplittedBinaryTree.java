package Tree.MaximumProductOfSplittedBinaryTree;
public class MaximumProductOfSplittedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static long totalSum = 0;
    static long maxProduct = 0;
    static int MOD = 1000000007;

    public static int maxProduct(TreeNode root) {
        totalSum = treeSum(root);
        findMax(root);
        return (int)(maxProduct % MOD);
    }

    private static long treeSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }

    private static long findMax(TreeNode node) {
        if (node == null) return 0;

        long left = findMax(node.left);
        long right = findMax(node.right);

        long subTreeSum = node.val + left + right;
        long product = subTreeSum * (totalSum - subTreeSum);

        maxProduct = Math.max(maxProduct, product);
        return subTreeSum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println(maxProduct(root));
    }
}
