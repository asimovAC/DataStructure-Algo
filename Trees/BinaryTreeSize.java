package trees;

class NodeTree
{
	int data;
	NodeTree left,right;
	
	public NodeTree(int item)
	{
		
		this.data = item;
		this.left = null;
		this.right = null;
	}
}

class BinaryTreeSize 
{
	static NodeTree root = null;
	
	public int size(NodeTree root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int leftsize = size(root.left);
		int rightsize = size(root.right);
		return leftsize + rightsize + 1;
	}

	public static void main(String[] args) {
		
		BinaryTreeSize tree = new BinaryTreeSize();
        tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);
 
        System.out.println(tree.size(root));

	}

}
