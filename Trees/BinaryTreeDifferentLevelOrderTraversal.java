package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDifferentLevelOrderTraversal {

	static NodeTree root;
	
	public void differentLevel(NodeTree root)
	{
		Queue<NodeTree> q1 = new LinkedList<NodeTree>();
		Queue<NodeTree> q2 = new LinkedList<NodeTree>();
		
		q1.add(root);
		while(!q1.isEmpty() || !q2.isEmpty())
		{
			while(!q1.isEmpty())
			{
				NodeTree temp = q1.poll();
				if(temp.left != null)
				{
					q2.add(temp.left);
				}
				
				if(temp.right != null)
				{
					q2.add(temp.right);
				}
				
				
				System.out.print(temp.data + " ");
			}
			System.out.println();
			while(!q2.isEmpty())
			{
				NodeTree temp2 = q2.poll();

				if(temp2.left != null)
				{
					q1.add(temp2.left);
				}
				if(temp2.right != null)
				{
					q1.add(temp2.right);
				}
				
				System.out.print(temp2.data + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTreeDifferentLevelOrderTraversal tree = new BinaryTreeDifferentLevelOrderTraversal();
		
	 	tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);
        tree.root.right.left = new NodeTree(6);
        tree.root.right.right = new NodeTree(7);
        
        tree.differentLevel(root);
	}

}
