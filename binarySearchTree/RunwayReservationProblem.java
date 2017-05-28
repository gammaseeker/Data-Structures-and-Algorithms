package binarySearchTree;
import java.util.*;
public class RunwayReservationProblem {

	private final static int k = 3;
	static BinarySearchTree runway = new BinarySearchTree();
	static ArrayList<Integer> reservations = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		
	}
	
	private static void reserve(int time)
	{
		
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
