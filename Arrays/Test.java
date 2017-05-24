package Arrays;

public class Test {
	public static void main(String[] args)
	{
		int[] myArr = new int[2000];
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		for(int i = 0; i < myArr.length; i++)
		{
			myArr[i] = i;
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		start = 0;
		end = 0;
		start = System.currentTimeMillis();
		int[] myArr2 = new int[3000];
		for(int i = 0; i < myArr.length; i++)
		{
			myArr2[i] = myArr[i];
		}
		for(int i = myArr.length; i < myArr2.length; i++)
		{
			myArr2[i] = i;
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
