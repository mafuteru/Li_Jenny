import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter math grade(A-F): ");
		String gr1= kb.next();
		System.out.println("Enter science grade: ");
		String gr2= kb.next();
		System.out.println("Enter English grade: ");
		String gr3= kb.next();
		System.out.println("Enter history grade: ");
		String gr4= kb.next();
		System.out.println("Enter art grade: ");
		String gr5= kb.next();
		System.out.println("Enter psychology grade: ");
		String gr6= kb.next();
		System.out.println("Enter computer science grade: ");
		String gr7= kb.next();
		
		double gPoints= calcPoints(gr1)+calcPoints(gr2)+calcPoints(gr3)+calcPoints(gr4)+calcPoints(gr5)+calcPoints(gr6)+calcPoints(gr7);
		System.out.printf("Your GPA is: %.2f",(gPoints/7));
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}