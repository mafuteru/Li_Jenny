import java.util.Scanner;
public class CountDigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		System.out.println(countDigits(kb.nextInt()));
	}
	
	public static int countDigits(int num)
	{
		while(num>0) //input a number: 654321
		{
			return 1+(countDigits(num/10)); //call same number but with one less digit
			//continue to call itself and shave off one digit each time as long as num>0
		}
		return 0;
	}
	
}