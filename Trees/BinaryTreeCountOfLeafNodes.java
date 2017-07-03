package trees;

  
public class BinaryTreeCountOfLeafNodes 
{
    NodeTree root;
   
    int count() 
    {
        return getLeafCount(root);
    }
  
    int getLeafCount(NodeTree root2) 
    {
        if (root2 == null)
            return 0;
        if (root2.left == null && root2.right == null)
            return 1;
        else
            return getLeafCount(root2.left) + getLeafCount(root2.right);
    }
  
   
    public static void main(String args[]) 
    {
        /* create a tree */    BinaryTreeCountOfLeafNodes tree = new BinaryTreeCountOfLeafNodes();
        tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);
        
        System.out.println(tree.count());
    }
}