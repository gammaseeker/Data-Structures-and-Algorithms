package arrays;

public class LargestRowSum {

	public static void main(String[] args)
	{
		int[][] matrix = {{2, 3, 4}, {9, 9, 9}, {8, 2, 1}};
		System.out.println(maxRow(matrix));
	}
	
	public static int maxRow(int[][] matrix)
	{
		int maxTotal = 0;
		int total = 0;
		int row = 0;
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[r].length; c++)
			{
				total += matrix[r][c];
			}
			if(total > maxTotal)
			{
				maxTotal = total;
				total = 0;
				row = r;
			}
		}
		
		return row;
	}
}
