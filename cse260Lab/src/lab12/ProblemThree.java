package lab12;
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class ProblemThree {

//	 Write the following enhanced for statement as a pipeline with lambda expressions. Hint: Use the filter intermediate operation and the forEach terminal operation. 
//
//	 for (Person p : roster) {
//
//	     if (p.getGender() == Person.Sex.MALE) {
//
//	         System.out.println(p.getName());
//
//	     }
//
//	 }
	public static void main(String[] args) {
		Person[] roster = new Person[0];
		for (Person p : roster) {

	     if (p.getGender() == Person.Sex.MALE) {

	         System.out.println(p.getName());

	     }

		}
		
		List<Person> rosterList = Arrays.asList(roster);

        List<Person> result = rosterList.stream()                
                .filter(line -> line.getGender() == Person.Sex.MALE)  
                .collect(Collectors.toList());              

        result.forEach(System.out::println); 
	}
	
	public class Person {

	    public enum Sex {
	        MALE, FEMALE
	    }

	    String name;
	    LocalDate birthday;
	    Sex gender;
	    String emailAddress;
	    
	    // ...

	    public int getAge() {
	        // ...
	    }

	    public String getName() {
	        // ...
	    }
	    
	    public Sex getGender() {
	    	return gender;
	    }
	}
}
