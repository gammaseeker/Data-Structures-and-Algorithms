import java.util.*;

public class SinglyLinkedList {
	LinkNode head;

    public SinglyLinkedList(LinkNode node) { 

       head = node;

    }
    public static String search(SinglyLinkedList list, String target)
    {
    	LinkNode x = list.head;
    	if(x.data.equals(target))
		{
			return x.data;
		}
    	while(x.next != null)
    	{
    		x = x.next;
    		if(x.data.equals(target))
    		{
    			return x.data;
    		}
    	}
    	return null;
    }
    public static String search(SinglyLinkedList list, int target)
    {
    	int ctr = 0;
    	LinkNode x = list.head;
    	while(ctr != target)
    	{
    		x = x.next;
    	}
    	return x.data;
    }
    public static void add(SinglyLinkedList list, String item) 
    { 
    	LinkNode x = list.head;
    	if(x != null)
    	{
    		while(x.next != null)
        	{
        		x = x.next;
        		if(x.next.equals(null))
        		{
        			x.next = new LinkNode(item);
        		}
        	}
    	}
    	else
    	{
    		x.next = new LinkNode(item);
    	}
       //pseudo code: while next isn't null, walk the list
       //once you reach the end, create a new LinkNode and add the item to it.  Then
       //set the last LinkNode's next to this new LinkNode

    }
    public static void add(SinglyLinkedList list, String item, int index) 
    { 
    	LinkNode x = list.head;
    	if(x != null)
    	{
    		while(x.next != null)
        	{
        		x = x.next;
        		if(x.next.equals(null))
        		{
        			x.next = new LinkNode(item);
        		}
        	}
    	}
    	else
    	{
    		x.next = new LinkNode(item);
    	}

    }

}
