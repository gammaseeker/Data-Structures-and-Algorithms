package trees;

public class Node {
	private int data;
	private Node left, right, parent;
	
	public Node(int data)
	{
		this.data = data;
	}
	
	public void setLeft(Node n)
	{
		this.left = n;
		if(n!= null)
		{
			n.parent = this;
		}
	}
	
	public void setRight(Node n)
	{
		this.right = n;
		if(n!= null)
		{
			n.parent = this;
		}
	}
	
	public int getData()
	{
		return data;
	}
	
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
}
