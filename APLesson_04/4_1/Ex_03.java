import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Ex_03 loan = new Ex_03(); 
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter interest rate (as a % from 0 to 1):");
		double rate = kb.nextDouble();
		
		System.out.println("Enter principal value:");
		double princpl = kb.nextDouble();
		
		System.out.println("Enter number of times the loan is compounded per year:");
		double number = kb.nextDouble();
		
		System.out.println("Enter life of the loan (years):");
		double time = kb.nextDouble();
		
		double interest = loan.payment(rate, princpl, number, time);
		
		//method call: objectName.methodName
		System.out.printf("Your total monthly payment is $%.2f",interest);
	}
	
	public double payment(double r, double p, double n, double t)
	{
		//all your math goes here
		return (p*(Math.pow(1+r/n, n*t)))/(t*12);
	}
}