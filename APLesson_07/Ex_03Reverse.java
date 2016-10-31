import java.util.Scanner;
public class Ex_03Reverse
{
	static int number;
	static int rev=0;
	static int num;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		num = number;
		
		getReverse();
		System.out.println(number+" reversed is "+rev);
	}
	
	public static void getReverse()
	{
		while(num>0)
		{
			rev*=10;
			rev+=(num%10);
			num/=10;
		}
	}
}