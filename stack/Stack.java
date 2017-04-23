package stack;

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
	
	public int size()
	{
		return length;
	}
	
	public boolean isFull()
	{
		return theStack.size() == length;
	}
	public boolean isEmpty()
	{
		return theStack.size() == 0;
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
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		top--;
		return theStack.remove(top);
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		return theStack.get(top);
	}
}

