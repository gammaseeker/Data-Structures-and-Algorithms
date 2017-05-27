package binarySearchTree;

public class Node {
	private int data;
	private Node right;
	private Node left;
	private Node parent;
	
	public Node(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public Node getParent()
	{
		return this.parent;
	}
	
	public Node getRight()
	{
		return this.right;
	}
	
	public Node getLeft()
	{
		return this.left;
	}
	
	public void setParent(Node parent)
	{
		this.parent = parent;
	}
	
	public void setRight(Node right)
	{
		this.right = right;
		right.parent = this;
	}
	
	public void setLeft(Node left)
	{
		this.left = left;
		left.parent = this;
	}
	
	public String toString()
	{
		return Integer.toString(this.data);
	}
}
