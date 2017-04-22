package linkedLists;

public class Node {
	private String data;
	private Node next;
	public Node(String item)
	{
		data = item;
		
	}
	
	public boolean setNext(Node next)
	{
		this.next = next;
		return true;
	}
	
	public Node getNext()
	{
		if(this.next != null)
		{
			return this.next;
		}
		return null;
	}
	
	public String getData()
	{
		return data;
	}
}
