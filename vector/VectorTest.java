package vector;
import java.util.*;

public class VectorTest {
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0; i <= 5; i++)
		{
			v.add(i);
		}
		System.out.println(v);
		System.out.println(v.get(4));
	}
}
