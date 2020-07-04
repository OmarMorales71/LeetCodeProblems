package tree;

public class ConstructBinarySearchTreeFromPreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        
        for(int i = 1; i<preorder.length;i++) {
        	TreeNode node = new TreeNode(preorder[i]);
        	insert(root, node);
        	
        }
        
        return root;
    }
	
	public void insert(TreeNode root, TreeNode node) {
		if(node.val<root.val) {
			if(root.left==null) {
				root.left=node;
			}else {
				insert(root.left, node);
			}
		}else {
			if(root.right==null) {
				root.right=node;
			}else {
				insert(root.right, node);
			}
		}
	}

}

