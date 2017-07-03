package trees;

public class BinaryTreeCheckMirror {

	public boolean isMirror(NodeTree r1,NodeTree r2)
	{
		if( r1 == null && r2 == null)
			return true;
		
		if( r1 == null || r2 == null)
			return false;
		
		if(r1.data == r2.data)
		{
			if( isMirror(r1.left,r2.right) && isMirror(r1.right,r2.left))
				return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		
		  BinaryTreeCheckMirror tree = new BinaryTreeCheckMirror();
	        NodeTree a = new NodeTree(1);
	        NodeTree b = new NodeTree(1);
	        a.left = new NodeTree(2);
	        a.right = new NodeTree(3);
	        a.left.left = new NodeTree(4);
	        a.left.right = new NodeTree(5);
	 
	        b.left = new NodeTree(3);
	        b.right = new NodeTree(2);
	        b.right.left = new NodeTree(5);
	        b.right.right = new NodeTree(4);
	 
	        if (tree.isMirror(a, b) == true)
	            System.out.println("Yes");
	        else
	            System.out.println("No");

	}

}
