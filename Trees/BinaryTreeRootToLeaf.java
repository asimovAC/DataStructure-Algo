package trees;

import java.util.Stack;

public class BinaryTreeRootToLeaf {

	static NodeTree root;
	
	public void printAll(NodeTree root)
	{
		Stack<NodeTree> s1 = new Stack<NodeTree>();
		
		if(root == null)
			return;
		
		s1.push(root);
		printAll(root.left);
		
		if(root.left == null && root.right == null)
		{
			Stack<NodeTree> s2 = new Stack<NodeTree>();
			while(!s1.isEmpty())
			{				
				NodeTree temp = s1.pop();
				s2.push(temp);
			}
			while(!s2.isEmpty())
			{				
				NodeTree temp2 = s2.pop();
				System.out.println(temp2.data + " ");
				s1.push(temp2);
			}
			
			
		}
		printAll(root.right);
		
		s1.pop();
	}
	
	public static void main(String[] args) {
	
		BinaryTreeRootToLeaf tree = new BinaryTreeRootToLeaf();
        tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(10);
        tree.root.right = new NodeTree(8);
        tree.root.left.left = new NodeTree(2);
        tree.root.left.right = new NodeTree(3);
        tree.root.right.left = new NodeTree(5);
        tree.root.right.right = new NodeTree(2);
        
        tree.printAll(root);

	}

}
