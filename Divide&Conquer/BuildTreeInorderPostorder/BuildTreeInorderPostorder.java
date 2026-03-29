import java.util.*;

class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int v){
        val=v;
    }
}

public class BuildTreeInorderPostorder {

    static int postIndex;
    static HashMap<Integer,Integer> map;

    public static TreeNode buildTree(int[] inorder,int[] postorder){

        map=new HashMap<>();

        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i],i);

        postIndex=postorder.length-1;

        return build(inorder,postorder,0,inorder.length-1);
    }

    static TreeNode build(int[] inorder,int[] postorder,int left,int right){

        if(left>right)
            return null;

        int val=postorder[postIndex--];

        TreeNode root=new TreeNode(val);

        int idx=map.get(val);

        root.right=build(inorder,postorder,idx+1,right);
        root.left=build(inorder,postorder,left,idx-1);

        return root;
    }

    static void preorder(TreeNode root){

        if(root==null)
            return;

        System.out.print(root.val+" ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args){

        int[] inorder={9,3,15,20,7};
        int[] postorder={9,15,7,20,3};

        TreeNode root=buildTree(inorder,postorder);

        preorder(root);
    }
}