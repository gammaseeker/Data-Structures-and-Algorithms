package arrays;

public class TwoDimensionalArrays 
{
	public static void main(String[] args)
	{
		int[][] matrix = new int[4][9];
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[r].length; c++)
			{
				matrix[r][c]= (int)(Math.random()*601) + 200;
			}
		}
		int[][] myMatrix = new int[2][2];
		for(int r = 0; r < myMatrix.length; r++)
		{
			for(int c = 0; c < myMatrix[r].length; c++)
			{
				myMatrix[r][c]= 5;
			}
		}
		System.out.println(averageValue(myMatrix));
	}
	public static int totalOfXXValues(int[][] matrix)
	{
		int sum = 0;
		for(int r = 0; r < matrix.length; r++)
		{
			sum = sum + matrix[r][r];		
		}
		return sum;
	}
	
	public static double averageValue(int[][] matrix)
	{
		double avg = 0;
		for(int[] arr : matrix)
		{
			for(int i: arr)
			{
				avg = avg + i;
			}
		}
		return avg/(matrix[0].length * matrix.length);
	}

}

