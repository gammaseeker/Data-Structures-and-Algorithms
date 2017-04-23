package stack;

public class Test {
	public static void main(String[] args)
	{
		Stack myStack = new Stack(5);
		System.out.println(myStack.isFull());
		System.out.println(myStack.isEmpty());
		for(int i = 0; i <= 4; i++)
		{
			myStack.push(i);
		}
		System.out.println(myStack.size());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.size());
	}

}
