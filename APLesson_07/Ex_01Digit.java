import java.util.Scanner;
public class Ex_01Digit
{
	static int number;
	static int sum=0;
	static int num;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		num= number;
		sumDigits();
		System.out.println("The sum of the digits in "+number+" is "+sum);
	}
	
	public static void sumDigits()
	{
		while(num>0)
		{
			sum += (num % 10); //num%10 returns the last digit on the right
			num /= 10;
		}
	}
}