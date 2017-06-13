package set;
import java.util.*;

public class Practice {
	public static void main(String[] args)
	{
		int[] test = {0, 7, 7, 12, 4, 6, 78, 78, 2, 2};
		System.out.println(solution1(test));
		System.out.println(solution2(test));
		System.out.println(solution3(test));
	}
	
	public static Set<Integer> solution1(int[] arr)
	{
		Set<Integer> set = new HashSet<>();
		for(int i: arr)
		{
			set.add(i);
		}
		return set;
	}
	
	public static Set<Integer> solution2(int[] arr)
	{
		Set<Integer> set = new LinkedHashSet<>();
		for(int i: arr)
		{
			set.add(i);
		}
		return set;
	}
	
	public static Set<Integer> solution3(int[] arr)
	{
		Set<Integer> set = new TreeSet<>();
		for(int i: arr)
		{
			set.add(i);
		}
		return set;
	}
	
	public static int[] solution4(int[] arr)
	{
		return arr;
	}
	
	public static LinkedList<Integer> solution5(int[] arr)
	{
		LinkedList<Integer> list = new LinkedList<>();
		for(int i: arr)
		{
			list.add(i);
		}
		return list;
	}
	
	public static Stack<Integer> solution5Alt(int[] arr)
	{
		Stack<Integer> s = new Stack<>();
		for(int i: arr)
		{
			s.push(i);
		}
		return s;
	}
	
	public static LinkedList<Integer> solution6(int[] arr)
	{
		LinkedList<Integer> list = new LinkedList<>();
		for(int i: arr)
		{
			list.add(i);
		}
		return list;
	}
	
	public static Queue<Integer> solution6Alt(int[] arr)
	{
		Queue<Integer> q = new ArrayDeque<>();
		for(int i: arr)
		{
			q.add(i);
		}
		return q;
	}
}
