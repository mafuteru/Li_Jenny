import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner bmi = new Scanner(System.in);
		System.out.println("This is the BMI calculator.\nWhat is your height in inches?");
		double height = bmi.nextDouble();
		
		System.out.println("What is your weight in pounds");
		double weight = bmi.nextDouble();
		
		double result = 703*weight/(height*height);
		System.out.println("Your BMI is "+result+".");
	}
}