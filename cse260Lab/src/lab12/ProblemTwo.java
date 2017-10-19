package lab12;
import java.util.*;
import java.io.*;

public class ProblemTwo {

//	Write a method that takes a List<String> and applies String.trim to each element. 
//
//	Hint: The enhanced for statement does not allow you to modify the List. Using an instance of the Iterator class allows you to delete elements, but not replace an existing element or add a new one. That leaves ListIterator.
	
	public static void main(String[] args) {
		List<String> testList = new ArrayList<String>();
		testList.add("    YEEET   ");
		testList.add("YEEE B  OO  II            ");
		trimMethod(testList);
		System.out.println(testList);
	}
	
	public static void trimMethod(List<String> input) {
		ListIterator<String> litr =input.listIterator();
		while(litr.hasNext()){
			litr.set(litr.next().trim());
		}
		
	}
}
