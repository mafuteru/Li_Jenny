import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Ex_04 volume = new Ex_04(); 
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches: ");
		double height = kb.nextDouble();
		
		System.out.println("Enter length in inches: ");
		double length = kb.nextDouble();
		
		System.out.println("Enter width in inches: ");
		double width = kb.nextDouble();
		
		double vol = volume.calcVol(height,length,width);
		System.out.printf("The volume of your box in cubic feet is %.2f",vol);
		
	}
	
	public double calcVol(double h, double l, double w)
	{
		return (h*l*w)/1728;
		//all your math goes here
	}
}