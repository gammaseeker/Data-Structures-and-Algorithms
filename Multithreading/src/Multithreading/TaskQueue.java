package Multithreading;
import java.util.*;

public class TaskQueue implements Runnable{

	Queue<Integer> myQ;
	public TaskQueue(Queue<Integer> q)
	{
		this.myQ = q;
	}
	@Override
	public void run() {
		for(int i = 0; i < myQ.size(); i++)
		{
			System.out.print(myQ.remove() + " /");
		}
		
	}

}
