package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeReverseLevelOrder {

	static NodeTree root;
	public void reverseLevelOrderTraversal(NodeTree root)
	{
		Queue<NodeTree> q = new LinkedList<NodeTree>(); 
		
		Stack<NodeTree> s = new Stack<NodeTree>();
		
		q.add(root);
		while(!q.isEmpty())
		{
			NodeTree temp = q.poll();
			s.push(temp);
			
			if(temp.right != null)
			{
				q.add(temp.right);
			}
			

			if(temp.left != null)
			{
				q.add(temp.left);
			}
			
		}
		
		while(!s.empty())
		{
			NodeTree temp2 = s.pop();
			System.out.print(temp2.data + " ");
		}
	}
	
	public static void main(String[] args) {
		
			BinaryTreeReverseLevelOrder tree = new BinaryTreeReverseLevelOrder();
		
		 	tree.root = new NodeTree(1);
	        tree.root.left = new NodeTree(2);
	        tree.root.right = new NodeTree(3);
	        tree.root.left.left = new NodeTree(4);
	        tree.root.left.right = new NodeTree(5);
	        tree.root.right.left = new NodeTree(6);
	        tree.root.right.right = new NodeTree(7);
	        
	        tree.reverseLevelOrderTraversal(tree.root);

	}

}
