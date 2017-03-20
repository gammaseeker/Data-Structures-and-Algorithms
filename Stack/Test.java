
public class Test {
	public static void main(String[] args)
	{
		Stack myStack = new Stack(1);
		System.out.println(myStack.isFull());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.push(5));
		System.out.println(myStack.isFull());
		System.out.println(myStack.isEmpty());
	}

}
