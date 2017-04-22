package linkedLists;

public class DoublyLinkedList extends LinkedList
{
	public DoublyLinkedList()
	{
		super();
	}
	
	public DoublyLinkedList(Node node)
	{
		super(node);
	}
	
	@Override
	public void add(Node node) 
	{
		Node x = head;
    	if(x.getNext() == null)
    	{
    		x.setNext(node);
    		length++;
    	}
    	else
    	{
    		while(x.getNext() != null)
        	{
        		x = x.getNext();
        		if(x.getNext() == null)
        		{
        			x.setNext(node);
        			length++;
        			break;
        		}
        	}
    	}
		
	}

	@Override
	public void insert(Node node, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}
}
