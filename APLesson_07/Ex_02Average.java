import java.util.Scanner;
public class Ex_02Average
{
	static int number;
	static int digits=0;
	static int average=0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		
		avDigits();
		System.out.println("The average of the digits in "+number+" is "+(average/digits));
	}
	
	public static void avDigits()
	{
		int num= number;
		while(num>0)
		{
			digits++;
			average+=(num%10);
			num/=10;
		}
	}
}