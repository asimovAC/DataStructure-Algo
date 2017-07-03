package trees;

import java.util.Stack;

class BinaryTreeLevelOrderSpiral {
	
	static NodeTree root;
	
	public void printSpiralUsingStack(NodeTree root)
	{
		Stack<NodeTree> s1 = new Stack<NodeTree>();
		Stack<NodeTree> s2 = new Stack<NodeTree>();
		
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			while(!s1.empty())
			{
				NodeTree temp1= s1.pop();
				
				if(temp1.left != null)
					s2.add(temp1.left);
				
				if(temp1.right != null)
					s2.add(temp1.right);
				
				System.out.print(temp1.data + " ");
			}
			
			while(!s2.empty())
			{
				NodeTree temp2 = s2.pop();
				
				if(temp2.left != null)
					s1.add(temp2.left);
				
				if(temp2.right != null)
					s1.add(temp2.right);
				
				System.out.print(temp2.data + " ");
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		BinaryTreeLevelOrderSpiral tree = new BinaryTreeLevelOrderSpiral();
        tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(7);
        tree.root.left.right = new NodeTree(6);
        tree.root.right.left = new NodeTree(5);
        tree.root.right.right = new NodeTree(4);
      
        tree.printSpiralUsingStack(tree.root);

	}

}
