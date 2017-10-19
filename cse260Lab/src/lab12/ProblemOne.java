package lab12;
import java.util.*;
import java.io.*;

public class ProblemOne {

//	Implement a Java 8 program that prints the distinct arguments passed to a program using a SortedSet and specify a Comparator so that case is ignored when sorting and identifying set elements.
	public static void main(String[] args) {
		SortedSet<String> mySet = new TreeSet<String>(Arrays.asList(args));
		mySet
		.stream()
		.forEach(e -> System.out.println(e));
	}
}
