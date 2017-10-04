import java.math.*;
import java.util.*;

public class SortComparableObjects {
	 public static void main(String[] args) {
		 String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};// Create an array
		 Arrays.sort(cities); //Sort the array
		 for (String city: cities)
			 	System.out.print(city + " ");
		 System.out.println();
		 BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"), // Create an array
		 new BigInteger("432232323239292"),
		 new BigInteger("54623239292")};
		 Arrays.sort(hugeNumbers);// Sort the array
		 for (BigInteger number: hugeNumbers)
			 System.out.print(number + " ");
	 }
}
