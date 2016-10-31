import java.util.Scanner;
public class Lesson_07
{
	static int number;
	static int digits =0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		countDigits();
		System.out.println(number + " has "+digits+" digits.");
		
	}
	public static void countDigits()
	{
		int num = number; //placeholder so that value of number never changes
		while(num>0)
		{
			digits += 1;
			//dividing by 10 shaves the last digit off
			num /= 10;
		}
	}
	
}