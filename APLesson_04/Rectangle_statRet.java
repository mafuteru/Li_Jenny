import java.util.Scanner;
public class Rectangle_statRet
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length:");
		double l=kb.nextDouble();
		System.out.println("Enter width:");
		double w=kb.nextDouble();
		print(calcPerim(l,w));
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	
	public static void print(double per)
	{
		System.out.printf("Your rectangle is %.5f ft around.",per);
	}
	
}