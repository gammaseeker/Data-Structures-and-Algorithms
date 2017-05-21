package hashTable;
import java.util.*;

public class HashTable {
	
	private LinkedList<Integer>[] hashTable;
	public int m = 11;
	public final double A = (Math.sqrt(5) - 1)/2;
	
	@SuppressWarnings("unchecked")
	public HashTable()
	{
		hashTable = new LinkedList[11];
	}
	
	@SuppressWarnings("unchecked")
	public HashTable(int capacity)
	{
		hashTable = new LinkedList[capacity];
	}
	
	private int hash(int key)
	{
		return divisionMethod(key);
	}
	
	private int divisionMethod(int key)
	{
		return key % m;
	}
	
	/*private int multiplicationMethod(int data)Requires more research
	{
		return 
	}*/
	
	private int myHash(int key)
	{
		int num = key % m;
		if(num%2 == 0)
		{
			return num % 19;
		}
		else
		{
			return num % 16;
		}
	}
	
	public void put(int key, int data)
	{
		int index = hash(key);
		hashTable[index].add(data);
	}
	
	public int search(int data)
	{
		int index = hash(data);
		for(int i = 0; i < hashTable[index].size(); i++)
		{
			if(hashTable[index].get(i) == data)
			{
				return hashTable[index].get(i);
			}
		}
		return 0;
	}
	
	public void delete()
	{
		
	}
	
	public int get()
	{
		return 0;
	}
}
