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
	/**
	 * 
	 * @return the length of the linked list
	 */
	public int size()
	{
		return length;
	}
	 /**
     * 
     * @param list the SinglyLinkedList to search in.
     * @param target the int to search for.
     * @return a Node that is specified by @param target.
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
    /**
    * Appends node to end of linked list
	* @param node the node to be added.
	*/
	public abstract void add(Node node);
	
	/**
	 * Inserts node at specified index.
	 * @param node the node to be inserted
	 * @param index the position of where to insert the node
	 */
	public abstract void insert(Node node, int index);
	
	/**
	 * Deletes node at index
	 * @param index the position of the node to be deleted
	 */
	public abstract void delete(int index);
	
	/**
	 * Displays all data in linked list in a forward manner
	 */
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
