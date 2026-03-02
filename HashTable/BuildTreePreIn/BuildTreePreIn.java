package HashTable.BuildTreePreIn;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}

public class BuildTreePreIn {
    static int preIndex = 0;
    static Map<Integer, Integer> map = new HashMap<>();

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    private static TreeNode build(int[] preorder, int l, int r) {
        if (l > r) return null;

        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);

        int mid = map.get(val);

        root.left = build(preorder, l, mid - 1);
        root.right = build(preorder, mid + 1, r);

        return root;
    }

    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                System.out.print("null ");
                continue;
            }
            System.out.print(node.val + " ");
            q.add(node.left);
            q.add(node.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] preorder = new int[n];
        int[] inorder = new int[n];

        for (int i = 0; i < n; i++) preorder[i] = sc.nextInt();
        for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();

        TreeNode root = buildTree(preorder, inorder);
        printLevelOrder(root);
        sc.close();
    }
}