package trees;

import java.util.Stack;

public class BinaryTreeIterativePostOrder {

	static NodeTree root;
	
	public void printPostOrder(NodeTree root)
	{
		Stack <NodeTree> s1 = new Stack<NodeTree>();
		Stack <NodeTree> s2 = new Stack<NodeTree>();
		
		s1.push(root);
		
		while(!s1.isEmpty())
		{
			NodeTree temp = s1.pop();
			s2.push(temp);
			if(temp.left != null)
				s1.push(temp.left);
			
			if(temp.right != null)
				s1.push(temp.right);
		}
		
		while( !s2.isEmpty())
		{
			NodeTree temp2 = s2.pop();
			System.out.print(temp2.data + " ");
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTreeIterativePostOrder tree = new BinaryTreeIterativePostOrder();
		
		tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);
        tree.root.right.left = new NodeTree(6);
        tree.root.right.right = new NodeTree(7);
		
        tree.printPostOrder(root);

	}

}
