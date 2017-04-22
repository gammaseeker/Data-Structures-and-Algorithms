package linkedLists;

public class CircularSinglyLinkedList extends LinkedList 
{
	public CircularSinglyLinkedList()
	{
		super();
		head.setNext(head);
	}
	
	public CircularSinglyLinkedList(Node node)
	{
		super(node);
		node.setNext(node);
	}

	@Override
	 public void add(Node node)//Finished
    {
    	
    	Node x = head;
    	if(x.getNext() == x)
    	{
    		x.setNext(node);
    		node.setNext(x);
    		length++;
    	}
    	else
    	{
    		while(x.getNext() != x)
        	{
        		x = x.getNext();
        		if(x.getNext() == head)
        		{
        			x.setNext(node);
        			node.setNext(head);
        			length++;
        			break;
        		}
        	}
    	}
    }

	@Override
	 public void insert(Node node, int index)//TODO
    {
    	
    	if(index > length)
    	{
    		System.out.println("Index must be less than length");
    		return;
    	}
    	
    	if(index == 0)
    	{
    		head = node;
    	}
    	else
    	{
    		if(index == length)
	    	{
	    		add(node);
	    	}
    		else
    		{
    			Node x = head;
    			for(int i = 0; i < index-1; i++)
    	    	{
    	    		x = x.getNext();
    	    	}
    	    	Node temp = x;
    	    	node.setNext(temp.getNext());
    	    	temp.setNext(node);
    		}
    	}
    	
    	length++;
    }

	@Override
	public void delete(int index)//TODO
    {
    	if(index == (length-1))
    	{
    		Node x = head;
    		for(int i = 0; i < length-1; i++)
    		{
    			x = x.getNext();
    		}
    		x.setNext(null);
    	}
    	else
    	{
    		if(index == 0)
    		{
    			Node temp = head;
    			head = head.getNext();
    			temp.setNext(null);
    		}
    		else
    		{
    			Node x = head;
    			for(int i = 0; i < index-1; i++)
    			{
    				x = x.getNext();
    			}
    			Node temp = x;
    			x.setNext(temp.getNext().getNext());
    	    	temp.getNext().setNext(null);
    		}
    	}
    	length--;
    }
	
	/**
	 * Traverses linked list twice
	 */
	public void display()
	{
		Node x = head;
		for(int i = 0; i < 2*length; i++)
		{
			System.out.println(x.getData());
			x = x.getNext();
		}
	}
}
