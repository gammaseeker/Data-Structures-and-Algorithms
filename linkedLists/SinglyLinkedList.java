package linkedLists;

public class SinglyLinkedList implements LinkedList
{
	Node head;

    public SinglyLinkedList(Node node) { 

       head = node;

    }
    /**
     * 
     * @param list the SinglyLinkedList to search in.
     * @param target the String to search for.
     * @return a string that is specified by @param target.
     */
    public String search(SinglyLinkedList list, String target)
    {
    	Node x = list.head;
    	if(x.getData().equals(target))
		{
			return x.getData();
		}
    	while(x.getNext() != null)
    	{
    		x = x.getNext();
    		if(x.getData().equals(target))
    		{
    			return x.getData();
    		}
    	}
    	return null;
    }
    /**
     * 
     * @param list the SinglyLinkedList to search in.
     * @param target the index to search for.
     * @return a string that is specified by @param target. 
     */
    public String search(SinglyLinkedList list, int target)
    {
    	int ctr = 0;
    	Node x = list.head;
    	while(ctr != target)
    	{
    		x = x.getNext();
    	}
    	return x.getData();
    }
   /**
    * 
    * @param list the SinglyLinkedList to add in.
    * @param item the data of the node.
    * @return whether add was successful or not.
    */
    public boolean add(SinglyLinkedList list, String item) 
    { 
    	Node x = list.head;
    	if(x.getNext() == null)
    	{
    		x.setNext(new Node(item));
    		return true;
    	}
    	else
    	{
    		while(x.getNext() != null)
        	{
        		x = x.getNext();
        		if(x.getNext() == null)
        		{
        			x.setNext(new Node(item));
        			return true;
        		}
        	}
    	}
    	return false;
    }
    
    public boolean delete(SinglyLinkedList list, String item)
    {
    	return false;
    }
    
    public void display()
    {
    	
    }
}

