import java.util.*;

public class Stack {
	
	private List<Integer> theStack = new LinkedList<Integer>();;
	private int length;
	private int top;
	
	public Stack(int size)
	{
		length = size;
		top = -1;
	}
	
	public boolean isFull()
	{
		if(theStack.size() == length)
		{
			return true;
		}
		return false;
	}
	public boolean isEmpty()
	{
		if(theStack.size() == 0)
		{
			return true;
		}
		return false;
	}
	public boolean push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow Error");
			return false;
		}
		top++;
		theStack.add(top, data);
		return true;
	}
	public boolean pop()
	{
		return true;
	}
	public int peek()
	{
		return -1;
	}
}
