package recursion;

public class RecursionPractice
{
  public static void main(String[] args)
  {
    System.out.println(twoPow(3));
  }
  
  public static int twoPow(int n) //2^n Exercise 18.4
  {
    if(n == 0)
      return 1;
    return 2 * twoPow(n - 1);
  }
  
  public static int addConsecutiveTerms(int n)// 1+2+3+... +n Exercise 18.6
  {
    if(n == 0)
      return 0;
    return n + addConsecutiveTerms(n-1);
  }
}
