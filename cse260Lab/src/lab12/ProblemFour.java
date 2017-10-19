package lab12;
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class ProblemFour {

	public static void main(String[] args) {
//		Convert the following code into a new implementation that uses lambda expressions and aggregate operations instead of nested for loops. Hint: Make a pipeline that invokes the filter, sorted, and collect operations, in that order.
//		List<Album> favs = new ArrayList<>();
//		for (Album a : albums) {
//		    boolean hasFavorite = false;
//		    for (Track t : a.tracks) {
//		        if (t.rating >= 4) {
//		            hasFavorite = true;
//		            break;
//		        }
//		    }
//		    if (hasFavorite)
//		        favs.add(a);
//		}
//
//		Collections.sort(favs, new Comparator<Album>() {
//		                           public int compare(Album a1, Album a2) {
//		                               return a1.name.compareTo(a2.name);
//		                           }});

		List<Album> favs = new ArrayList<>();
		favs
		.stream()
		.filter(t -> t.rating >= 4)
		.sort((Album a1, Album a2) -> a1.name.compareTo(a2.name));
		.collect(Collectors.toList());
}
