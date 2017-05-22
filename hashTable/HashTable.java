package hashTable;
import java.util.*;

public class HashTable {
	
	private LinkedList<Integer>[] hashTable;
	public int m = 11;
	
	@SuppressWarnings("unchecked")
	public HashTable()
	{
		this.hashTable = new LinkedList[11];
	}
	
	@SuppressWarnings("unchecked")
	public HashTable(int capacity)
	{
		this.hashTable = new LinkedList[capacity];
	}
	
	public int getCapacity()
	{
		return m;
	}
	
	public void setCapacity(int capacity)
	{
		if(capacity < m)
		{
			System.out.println("Capacity must be greater than m");
		}
		else
		{
			this.m = capacity;
		}
	}
	private int hash(int key)
	{
		return divisionMethod(key);
		//return myHash(key);
	}
	
	private int divisionMethod(int key)
	{
		return key % this.m;
	}	
	
	private int myHash(int key)
	{
		int num = key % this.m;
		if(num%2 == 0)
		{
			return num % 19;
		}
		else
		{
			return num % 16;
		}
	}
	
	public void insert(int key, int data)
	{
		int index = hash(key);
		this.hashTable[index].add(data);
	}
	
	public int search(int data)
	{
		int index = hash(data);
		for(int i = 0; i < this.hashTable[index].size(); i++)
		{
			if(this.hashTable[index].get(i) == data)
			{
				return this.hashTable[index].get(i);
			}
		}
		return 0;
	}
	
	public void delete(int key, int data)
	{
		int index = hash(key);
		this.hashTable[index].remove(data);
	}
	
}
