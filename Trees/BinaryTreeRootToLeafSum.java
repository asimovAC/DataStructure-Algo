package trees;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeRootToLeafSum 
{

	static NodeTree root = null;

	public boolean printPath(NodeTree node,int sum,List<NodeTree> path)
	{
		if(root == null)
		{
			return false;
		}
		
		if(root.left == null && root.right == null)
		{
			if(root.data == sum)
			{
				path.add(root);
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		if(printPath(root.left,sum - root.data,path) || printPath(root.right,sum - root.data,path))
		{
			path.add(root);
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		int sum = 22;
           
        BinaryTreeRootToLeafSum tree = new BinaryTreeRootToLeafSum();
        tree.root = new NodeTree(10);
        tree.root.left = new NodeTree(8);
        tree.root.right = new NodeTree(2);
        tree.root.left.left = new NodeTree(3);
        tree.root.left.right = new NodeTree(5);
        tree.root.right.left = new NodeTree(2);

        List<NodeTree> path = new ArrayList<>();
        
        System.out.println(tree.printPath(root, sum, path));
        System.out.println(path);
	}

}
