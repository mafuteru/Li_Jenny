import java.util.Scanner;
public class logical
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		checkNum();
	}
	public static void checkNum()
	{
		System.out.println("Pick a number between 1 and 10: ");
		int guess=kb.nextInt();
		int number=(int)(Math.random()*10)+1;
		System.out.println("The number is "+number);
		if(guess>=1 && guess<=10)
		{
			if(guess==number)
			System.out.println("The number is right!");
		else
			System.out.println("Wrong!");
		}
		else
		{
				System.out.println("Make it a 1-10 please!");
				checkNum();
		}
	}
}