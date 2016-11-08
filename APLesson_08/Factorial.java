public class Factorial
{
	public static void main(String[]args)
	{
		System.out.println(factorial(8));
	}
	
	public static int factorial(int n)
	{
		if (n==1) return 1;
		return n*factorial(n-1); //call factorial recursively with one less integer n
		//8 * factorial(7) or 5040 = 40320
		//7 * factorial(6) or 720 = 5040 ...
		//3 * factorial(2) or 2 = 6
		//2 * factorial(1) or 1 = 2
		//returns: 1
	}
}