package Multithreading;

public class Client {

	public static void main(String[] args)
	{
		someMethod();
	}
	
	public static void someMethod()
	{
		TaskClass task = new TaskClass();
		Thread thread = new Thread(task);
		thread.start();
	}
}
