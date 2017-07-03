package trees;

import java.util.Stack;

public class BinaryTreeIterativePreOrder {

	static NodeTree root;
	public void iterativePreOrder(NodeTree root)
	{
		Stack<NodeTree> s1 = new Stack<NodeTree>();
		
		s1.push(root);
		while(!s1.isEmpty())
		{
			NodeTree temp = s1.pop();
			
			if(temp.right!= null)
				s1.push(temp.right);
			
			if(temp.left!= null)
				s1.push(temp.left);
			
			
			System.out.print(temp.data + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		BinaryTreeIterativePreOrder tree = new BinaryTreeIterativePreOrder();
        tree.root = new NodeTree(10);
        tree.root.left = new NodeTree(8);
        tree.root.right = new NodeTree(2);
        tree.root.left.left = new NodeTree(3);
        tree.root.left.right = new NodeTree(5);
        tree.root.right.left = new NodeTree(2);
        
        tree.iterativePreOrder(tree.root);

	}

}
