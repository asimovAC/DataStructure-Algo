package trees;

import java.util.LinkedList;
import java.util.Queue;



class BinaryTreeLevelOrderTraversal {

	static NodeTree root = null;
	
	void levelOrder(NodeTree root)
	{
		Queue <NodeTree> q = new LinkedList<NodeTree>();
		
		if(root == null)
			return;
		
		q.add(root);
		while(!q.isEmpty())
		{
			NodeTree temp = q.poll();
			System.out.print(temp.data + " ");
			
			if(root.left != null)
			{
				q.add(temp.left);
			}
			if(root.right != null)
			{
				q.add(temp.right);
			}
		}
		
	}
	public static void main(String[] args) {
		
		BinaryTreeLevelOrderTraversal tree_level = new BinaryTreeLevelOrderTraversal();
        tree_level.root = new NodeTree(1);
        tree_level.root.left = new NodeTree(2);
        tree_level.root.right = new NodeTree(3);
        tree_level.root.left.left = new NodeTree(4);
        tree_level.root.left.right = new NodeTree(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.levelOrder(root);
        System.out.println("asda");

	}

}
