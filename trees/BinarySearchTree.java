package trees;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree()
	{
		
	}
	
	public BinarySearchTree(Node root)
	{
		this.root = root;
	}
	
	public void insert(int data)
	{
		if(data <= root.getData())
		{
			if(root.getLeft() == null)
			{
				root.setLeft(new Node(data));
			}
			else
			{
				root.getLeft().insert(data);
			}
		}
		else
		{
			if(root.getRight() == null)
			{
				root.setRight(new Node(data));
			}
			else
			{
				root.getRight().insert(data);
			}
		}
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	public void inOrderTraverse(Node root)
	{
		if(root != null)
		{
			inOrderTraverse(root.getLeft());
			System.out.println(root.getData());
			inOrderTraverse(root.getRight());
		}
	}
}
