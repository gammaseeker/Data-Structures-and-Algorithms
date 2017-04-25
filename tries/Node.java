package tries;

public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data)
	{
		this.data = data;
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
