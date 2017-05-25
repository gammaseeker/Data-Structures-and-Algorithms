package Multithreading;
import java.util.*;

public class MultiQueue {

	public static void main(String[] args)
	{
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		Queue<Integer> q2 = new ArrayDeque<Integer>();
		Queue<Integer> q3 = new ArrayDeque<Integer>();
		for(int i = 0; i < 11; i++)
		{
			q1.add(i);
		}
		
		for(int i = 11; i < 22; i++)
		{
			q2.add(i);
		}
		
		for(int i = 22; i < 33; i++)
		{
			q3.add(i);
		}
		Runnable qTask1 = new TaskQueue(q1);
		Runnable qTask2 = new TaskQueue(q2);
		Runnable qTask3 = new TaskQueue(q3);
		
		Thread t1 = new Thread(qTask1);
		Thread t2 = new Thread(qTask2);
		Thread t3 = new Thread(qTask3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
