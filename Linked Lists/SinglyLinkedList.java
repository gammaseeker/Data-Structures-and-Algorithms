import java.util.*;

public class SinglyLinkedList {
	LinkNode head;

    public SinglyLinkedList(LinkNode node) { 

       head = node;

    }
    public String search(SinglyLinkedList list, String target)
    {
    	LinkNode x = list.head;
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
    	LinkNode x = list.head;
    	while(ctr != target)
    	{
    		x = x.getNext();
    	}
    	return x.getData();
    }
   
    public boolean add(SinglyLinkedList list, String item) 
    { 
    	LinkNode x = list.head;
    	if(x.getNext() == null)
    	{
    		x.setNext(new LinkNode(item));
    		return true;
    	}
    	else
    	{
    		while(x.getNext() != null)
        	{
        		x = x.getNext();
        		if(x.getNext() == null)
        		{
        			x.setNext(new LinkNode(item));
        			return true;
        		}
        	}
    	}
    	return false;
    	
       //pseudo code: while next isn't null, walk the list
       //once you reach the end, create a new LinkNode and add the item to it.  Then
       //set the last LinkNode's next to this new LinkNode

    }
   /* public  void add(SinglyLinkedList list, String item, int index) 
    { 
    	LinkNode x = list.head;
    	if(x != null)
    	{
    		while(x.getNext() != null)
        	{
        		x = x.getNext();
        		if(x.getNext().equals(null))
        		{
        			x.setNext(new LinkNode(item));
        		}
        	}
    	}
    	else
    	{
    		x.setNext(new LinkNode(item));
    	}

    }*/

}
