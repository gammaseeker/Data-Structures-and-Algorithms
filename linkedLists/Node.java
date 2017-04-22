package linkedLists;

public class Node  {
	private int data;
	private Node next;
	public Node()
	{
		
	}
	
	public Node(int item)
	{
		this.data = item;
		this.next = null;
	}
	
	public boolean setNext(Node next)
	{
		this.next = next;
		return true;
	}
	
	public Node getNext()
	{
		return this.next;
	}
	
	public int getData()
	{
		return this.data;
	}
}
