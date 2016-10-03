import java.util.Scanner;
public class Average_statRet
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1=kb.nextInt();
		System.out.println("Enter number 2:");
		int num2=kb.nextInt();
		System.out.println("Enter number 3:");
		int num3=kb.nextInt();
		print(num1,num2,num3,calcAvg(num1,num2,num3));
	}
	
	public static double calcAvg(int num1, int num2, int num3)
	{
		return(num1+num2+num3)/3.0;
	}
	
	public static void print(int num1, int num2, int num3,double avg)
	{
		System.out.printf("The average of %d, %d, and %d is %.5f",num1,num2,num3,avg);
	}
	
}