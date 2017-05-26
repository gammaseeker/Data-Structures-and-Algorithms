package Multithreading;

public class PrintNum implements Runnable{
	private int lastNum;
	
	public PrintNum(int n)
	{
		lastNum = n;
	}
	
	public void run()
	{
		for(int i = 1; i <= lastNum; i++)
		{
			System.out.print(" " + i);
			
		}
	}
}
