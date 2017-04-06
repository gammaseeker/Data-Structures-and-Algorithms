
public class Stack 
{
	private int length = 0;
	private LinkNode top = new LinkNode(null);
	
	public void push(String item)
	{
		LinkNode node = new LinkNode(item);
		if(top.getData().equals(null))
		{
			top = node;
		}
		else
		{
			node.setNext(top);
			top = node;
		}
		length++;
	}
	
	public String pop()
	{
		String result = "-1";
		
		if(top!= null)
		{
			result = top.getData();
			top = top.getNext();
			length--;
		}
		return result;
	}
	public int length()
	{
		return length;
	}
	
	public boolean isFull()
	{
		return false;
	}
	
	public boolean isEmpty()
	{
		return true;
	}
}
