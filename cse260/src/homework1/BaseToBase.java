package homework1;

public class BaseToBase {

	public static void main(String[] args){
				
		base2base("12345", 6, 8);
		base2base("STONY", 36, 19);
		base2base("832K1", 26, 15);
		
	}
	
	public static String base2base(String n, int b1, int b2){
		
		System.out.println("base2base(" + "\"" + n + "\"" + ", " + b1 + ", " + b2);
		System.out.println("Return: " + "\"" + Integer.toString(Integer.parseInt(n, b1), b2).toUpperCase() + "\"");
		return Integer.toString(Integer.parseInt(n, b1), b2).toUpperCase();

	}
}
