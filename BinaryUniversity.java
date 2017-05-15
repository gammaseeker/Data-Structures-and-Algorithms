import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class BinaryUniversity {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("BinaryUIn.txt"));
		
		ArrayList<Integer> tracker = new ArrayList<Integer>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
	    ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();

		int input = sc.nextInt();
		int numRows = sc.nextInt();
		int[][] courses = new int[numRows][3];
		
		for(int r = 0; r < numRows; r++)//populate matrix
		{
			for(int c = 0; c < 3; c++)
			{
				courses[r][c] = sc.nextInt();
				System.out.print(courses[r][c] +" ");
			}
			System.out.println();
		}
		
		for(int r = numRows - 1; r >= 0; r--)
		{
			
				if(courses[r][1] == 0 && courses[r][2] == 0)
				{
					
					//tracker.add(0, courses[r][0]);
					System.out.println(courses[r][0] + " TEST");
					System.out.println(process(r, courses[r][0], courses, tracker));
					paths.add(tracker);
				}
			
			
		}
	}
	
	private static int process(int r, int num, int[][] matrix, ArrayList<Integer> tracker)
	{
		tracker.add(0, matrix[r][0]);
		if(r == 0)
		{
			return matrix[0][0];
		}
		else
		{
			return search(num, matrix, tracker);
		}
		
		
	}
	
	private static int search(int num, int[][] matrix, ArrayList<Integer> tracker)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			if(matrix[r][1] == num)
			{
				return process(r, matrix[r][0], matrix, tracker);
			}
			if(num == matrix[r][2])
			{
				return process(r, matrix[r][0], matrix, tracker);
			}
		}
		return 0;
	}
	
	private static int calcSum()
	{
		return 0;
	}
}
