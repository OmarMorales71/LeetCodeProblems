package tree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length==0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index = -1;

        for(int i = 0; i<inorder.length;i++){
            if(inorder[i]==root.val){
                index=i;
                break;
            }
        }

        int[] lefts = new int[index];
        int[] rights = new int[(inorder.length-index)-1];

        System.arraycopy(inorder, 0           , lefts, 0     , lefts.length);
        System.arraycopy(inorder, index+1           , rights, 0     , rights.length);

        assignChildren(root, lefts, rights, preorder);

        return root;
    }

    private void assignChildren(TreeNode root, int[] lefts, int[] rights, int[] preorder) {
        if(lefts.length==0 && rights.length==0){
            return;
        }

        if(lefts.length!=0){
            //left
            int leftValue=-1;
            List<Integer> left = Arrays.stream(lefts)
                    .boxed()
                    .collect(Collectors.toList());

            for(int i = 0; i<preorder.length; i++){
                if(left.contains(preorder[i])){
                    leftValue=preorder[i];
                }
            }
        }




        assignChildren(root.left, lefts, rights,preorder);

        assignChildren(root.right, lefts, rights,preorder);
    }


}
