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
	
	public Node getParent()
	{
		return parent;
	}
	
	public void insert(int data)
	{
		if(data <= this.data)
		{
			if(left == null)
			{
				setLeft(new Node(data));
			}
			else
			{
				left.insert(data);
			}
		}
		else
		{
			if(right == null)
			{
				setRight(new Node(data));
			}
			else
			{
				right.insert(data);
			}
		}
	}
}
