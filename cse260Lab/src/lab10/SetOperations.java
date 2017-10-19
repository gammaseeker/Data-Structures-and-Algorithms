package lab10;
import java.util.*;

public class SetOperations {

//	(SetOperations.java) (Perform set operations on hash sets) Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"} and find and print their union, difference, and intersection. Implement public static methods for all these operations. (You can clone the sets to preserve the original sets from being changed by these set methods.)
	public static void main(String[] args) {
		String[] in1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		String[] in2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
		Set<String> names1 = new LinkedHashSet<String>(Arrays.asList(in1));
		Set<String> names2 = new LinkedHashSet<String>(Arrays.asList(in2));
		
		System.out.println(intersection(names1, names2));
		System.out.println(difference(names1, names2));
		System.out.println(union(names1, names2));
	}
	
	public static Set<String> intersection(Set<String> input1, Set<String> input2){
		Set<String> output = new LinkedHashSet<String>();
		for(String name: input1) {
			if(input2.contains(name)) {
				output.add(name);
			}
		}
		return output;
	}
	
	public static Set<String> difference(Set<String> input1, Set<String> input2){
		Set<String> output = new LinkedHashSet<String>();
		for(String name: input1) {
			if(!(input2.contains(name))) {
				output.add(name);
			}
		}
		return output;
	}
	
	public static Set<String> union(Set<String> input1, Set<String> input2){
		Set<String> output = new LinkedHashSet<String>();
		for(String name: input1) {
				output.add(name);
		}
		for(String name: input2) {
			output.add(name);
		}
		return output;
	}
}
