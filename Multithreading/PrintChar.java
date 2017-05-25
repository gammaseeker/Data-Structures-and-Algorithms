package Multithreading;

public class PrintChar implements Runnable{
	private char charToPrint;
	private int times;
	
	public PrintChar(char c, int t)
	{
		charToPrint = c;
		times = t;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < times; i++)
		{
			System.out.print(charToPrint);
		}
		
	}

}
