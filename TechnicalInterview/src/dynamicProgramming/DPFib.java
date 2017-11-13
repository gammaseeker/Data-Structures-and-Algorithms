package dynamicProgramming;

public class DPFib {

	public static void main(String[] args) {
		System.out.println(fib(5));
		System.out.println(fib(9));
		
		System.out.println(fibDynamic(5));
		System.out.println(fibDynamic(9));
		
		System.out.println(fibSpace(5));
		System.out.println(fibSpace(9));
	}
	
	public static int fib(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	public static int fibDynamic(int n) {
		int fibNums[] = new int[n + 1];
		fibNums[0] = 0;
		fibNums[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
		}
		
		return fibNums[n];
	}
	
	public static int fibSpace(int n) {
		int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
	}
}
