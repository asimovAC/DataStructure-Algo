package trees;

public class BinaryTreeLowestCommonAncestor {

	public NodeTree lca(NodeTree root, NodeTree n1, NodeTree n2){
        if(root == null){
            return null;
        }
        if(root == n1 || root == n2){
            return root;
        }
        
        NodeTree left = lca(root.left, n1, n2);
        NodeTree right = lca(root.right, n1, n2);

        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
	
	public static void main(String[] args) {
		
	}

}
