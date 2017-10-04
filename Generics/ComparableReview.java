import java.util.Date;


public class ComparableReview{

	public static void main(String[] args){
		System.out.println(new Integer(3).compareTo(new Integer(5)));
		System.out.println("ABC".compareTo("ABE"));
		@SuppressWarnings("deprecation")
		Date date1 = new Date(2013, 1, 1);
		@SuppressWarnings("deprecation")
		Date date2 = new Date(2012, 1, 1);
		System.out.println(date1.compareTo(date2));
	}
}
