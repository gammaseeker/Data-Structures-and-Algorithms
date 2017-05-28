package binarySearchTree;
import java.util.*;
public class RunwayReservationProblem {

	private final static int k = 3;
	static BinarySearchTree runway = new BinarySearchTree();
	static ArrayList<Integer> reservations = new ArrayList<Integer>();
	public static void main(String[] args)
	{
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
