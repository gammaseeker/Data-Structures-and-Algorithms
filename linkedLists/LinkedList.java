package linkedLists;

abstract public class LinkedList
{
	protected Node head;
	protected int length;
	
	public LinkedList()
	{
		head = new Node();
		length = 1;
	}
	public LinkedList(Node node)
	{
		head = node;
		length = 1;
	}
	public int size()
	{
		return length;
	}
	 /**
     * 
     * @param list the SinglyLinkedList to search in.
     * @param target the int to search for.
     * @return a node that is specified by @param target.
     */
    public Node search(int target)
    {
    	Node x = head;
    	if(x.getData() == (target))
		{
			return x;
		}
    	while(x.getNext() != null)
    	{
    		x = x.getNext();
    		if(x.getData() == (target))
    		{
    			return x;
    		}
    	}
    	return null;
    }
    
	public abstract void add(Node node);
	public abstract void insert(Node node, int index);
	public abstract void delete(int index);
	public void display()
	{
		Node x = head;
		for(int i = 0; i < length; i++)
		{
			System.out.println(x.getData());
			x = x.getNext();
		}
	}
}
