import java.util.Scanner;
public class Cube_statRet
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter side length:");
		double side=kb.nextDouble();
		print(side,calcSurf(side));
	}
	
	public static double calcSurf(double side)
	{
		return 6*(side*side);
	}
	
	public static void print(double side,double sa)
	{
		System.out.printf("The surface area of a cube with %.5f sides is %.5f.",side,sa);
	}
	
}