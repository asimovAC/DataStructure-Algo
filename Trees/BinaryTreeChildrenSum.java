package trees;

public class BinaryTreeChildrenSum {
	
	static NodeTree root;
	
	public int childrenSum(NodeTree root)
	{
		int left_data = 0;
		int right_data = 0;
		
		if (root == null || (root.left == null && root.right == null))
			return 1;
		else
		{
			if(root.left != null)
				left_data = root.data;
			
			if(root.right != null)
				right_data = root.data;
			
			if ((root.data == left_data + right_data)  && (childrenSum(root.left) != 0) && (childrenSum(root.right) != 0))
                return 1;
            else
                return 0;
		}
	}

	
	public static void main(String[] args) {
		
		BinaryTreeChildrenSum tree = new BinaryTreeChildrenSum();
		
		tree.root = new NodeTree(10);
        tree.root.left = new NodeTree(8);
        tree.root.right = new NodeTree(2);
        tree.root.left.left = new NodeTree(3);
        tree.root.left.right = new NodeTree(5);
        tree.root.right.right = new NodeTree(2);
//        tree.root.right.right = new NodeTree(7);

        System.out.println(tree.childrenSum(root));
	}

}
