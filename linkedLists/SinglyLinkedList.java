package linkedLists;

public class SinglyLinkedList {
	Node head;

    public SinglyLinkedList(Node node) { 

       head = node;

    }
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
    public  String search(SinglyLinkedList list, int target)
    {
    	int ctr = 0;
    	Node x = list.head;
    	while(ctr != target)
    	{
    		x = x.getNext();
    	}
    	return x.getData();
    }
   
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
}

