package stackJavaApi;
import java.util.*;

public class StackJavaApi {

	public static void main(String[] args)
	{
		Stack<Integer> myStack = new Stack<Integer>();
		for(int i = 1; i <= 20; i++)
		{
			myStack.push(getRandomInt(1, 70));
		}
		System.out.println(myStack);
	}
	
	private static int getRandomInt(int lower, int upper)
	{
		return (int)(Math.random() * (upper - lower)) + lower;
	}
}
