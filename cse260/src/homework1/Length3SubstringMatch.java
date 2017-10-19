package homework1;

public class Length3SubstringMatch {

	public static void main(String[] args){
		System.out.println(stringMatch3("banana","bananas"));
		System.out.println(stringMatch3("sdgndsgyudsaiufb","sadufygyudsafbnsaicgaf"));
	}
	
	public static int stringMatch3(String a, String b){
		int output = 0;
		int min = 0;
		
		if(a.length() < b.length()){
			min = a.length();
		}
		
		if(b.length() < a.length()){
			min = b.length();
		}
		
		if(a.length() == b.length()){
			min = a.length();
		}
		
		for(int i = 0; i < min - 2; i++){
			if(a.substring(i, i + 3).equals(b.substring(i, i + 3))){
				output++;
			}
		}
		
		return output;
	}
}
