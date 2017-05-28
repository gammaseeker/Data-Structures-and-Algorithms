package binarySearchTree;
import java.util.*;
public class RunwayReservationProblem {

	private final static int k = 3;
	static BinarySearchTree runway = new BinarySearchTree();
	static ArrayList<Integer> reservations = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		/*reservations.add(24);
		reservations.add(7);
		reservations.add(38);
		reservations.add(40);
		reservations.add(31);
		reservations.add(29);
		reservations.add(45);
		reservations.add(17);
		for(int i = 0; i < reservations.size(); i++)
		{
			runway.insert(new Node(reservations.get(i)));
		}*/
		for(int i = 0; i < 8; i++)
		{
			reserve(getRandomInt(1, 70));
		}
		
		System.out.println(reservations);
		System.out.println();
		runway.inOrder();
		System.out.println();
		runway.preOrder();
		System.out.println();
		runway.postOrder();
	}
	
	private static void reserve(int time)
	{
		reservations.add(time);
		if(check(time))
		{
			runway.insert(new Node(time));
		}
	}
	
	private static boolean check(int time)
	{
		if(time > k)
		{
			return true;
		}
		return false;
	}
	
	private static int getRandomInt(int lower, int upper)
	{
		return (int)(Math.random() * (upper - lower)) + lower;
	}
}
