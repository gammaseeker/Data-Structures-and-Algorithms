package avlTree;
import binarySearchTree.BinarySearchTree;
import binarySearchTree.Node;

public class AvlTree extends BinarySearchTree{
	private Node root;
	
	public AvlTree()
	{
		
	}
	
	public AvlTree(Node root)
	{
		this.root = root;
	}
}
