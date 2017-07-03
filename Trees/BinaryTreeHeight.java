package trees;


class BinaryTreeHeight 
{
	static NodeTree root = null;
	
	public static int height(NodeTree root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		if(lheight > rheight)
		{
			return 1 + lheight;
		}
		else
		{
			return 1 + rheight;
		}
	}
	

	public static void main(String[] args) {
		
		BinaryTreeHeight tree = new BinaryTreeHeight();
		  
        tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);

        System.out.println(height(root));
	}

}
