package tree;

public class KthSmallestElementInTheBST {
	static int kt, smallest;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(4);
		TreeNode n3 = new TreeNode(2);
		
		root.left=n1;
		root.right=n2;
		n1.right=n3;
		
		KthSmallestElementInTheBST obj = new KthSmallestElementInTheBST();
		
		System.out.println(obj.kthSmallest(root, 1));
		
	}

	public int kthSmallest(TreeNode root, int k) {
		kt=0;
		 inOrder(root, k);
		
		return smallest;
    }

	private void inOrder(TreeNode root,int k) {
		if(root!=null ) {
			inOrder(root.left, k);
			kt++;
			if(kt==k) {
				smallest=root.val;
				return;
			}else if(kt>k)return;
			
			inOrder(root.right, k);
		}
		
	}
}


