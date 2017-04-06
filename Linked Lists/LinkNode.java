
public class LinkNode {
	
	private String data;
	private LinkNode next;
	public LinkNode(String item)
	{
		data = item;
		
	}
	
	public boolean setNext(LinkNode next)
	{
		this.next = next;
		return true;
	}
	
	public LinkNode getNext()
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
