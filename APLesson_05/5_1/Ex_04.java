import java.util.Scanner;
public class Ex_04
{
	static String cond;
	static double bmi;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = kb.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		double weight = kb.nextDouble();
		
		bmi = 703*weight/(height*height);
		System.out.printf("Your BMI is: %.3f\n",bmi);
		calcCondish();
		System.out.println("You are "+cond);
	}
	
	public static void calcCondish()
	{
		cond="Not Found";
		if(bmi<18.5)
			 cond="Underweight";
		else if(bmi<=24.9)
			cond="Normal";
		else if(bmi<=29.9)
			cond="Overweight";
		else if(bmi<=34.9)
			cond="Obese";
		else if(bmi<=39.9)
			cond="Very Obese";
		else 
			cond="Morbidly Obese";
	}
	
}