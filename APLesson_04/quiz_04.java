import java.util.Scanner;
public class quiz_04
// Question 1
// {
	// public static void main(String[]args)
	// {
		// Scanner kb = new Scanner(System.in);
		// System.out.println("Please enter the cost of the first item:");
		// double item1 = kb.nextDouble();
		// System.out.println("Please enter the cost of the second item:");
		// double item2 = kb.nextDouble();
		
		// format(item1,item2);
	// }
	
	// public static void format(double one, double two)
	// {
		// double cost = one+two;
		// System.out.printf("The total cost of your order is $%.2",cost);
	// }
// }

//Question 3 (fixed)
// numPrint must be static
{
	static int num1 = 5;
	static int num2 = 7;
	static int num3 = 9;
	
	public static void main(String[]args)
	{
		numPrint(num1,num2,num3);
	}
	
	public static int calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3;
	}
	public static void numPrint(int one, int two, int three)
	{
		double avg=calcAvg(one,two,three);
		System.out.println("The average of "+one+" "+two+" "+three+" is "+avg);
	}
}

//Question 4 
// {
	// public static void main(String[]args)
	// {
		// Scanner kb = new Scanner(System.in);
		// System.out.println("What is the length of one side of the cube in inches?");
		// int side = kb.nextInt();
		// surfPrint(side);
	// }
	
	// public static double calcSurf(int side)
	// {
		// return 6*(Math.pow(side,2));
	// }
	
	// public static void surfPrint(int side)
	// {
		// System.out.printf("The surface area of your cube is %.5f inches",calcSurf(side));
	// }

// }

//Question 5-> ?

//Question 6 (fixed)
//re-defining variables: double area= 3.14*(radius*radius); will produce 0.000
// {
	// static double area;
	// static int radius;
	
	// public static void main(String[]args)
	// {
		// Scanner kb = new Scanner(System.in);
		// System.out.println("Please enter the radius of your circle: ");
		// radius=kb.nextInt();
		// calcArea();
		// radPrint();
	// }
	
	// public static void calcArea()
	// {
		// area= 3.14*(radius*radius);
	// }
	// public static void radPrint()
	// {
		// System.out.printf("The area of your circle is %.3f.",area);
	// }
// }

//Question 8
// {
	// public static void main(String[]args)
	// {
		// Scanner kb = new Scanner(System.in);
		// System.out.println("Name: ");
		// String name=kb.nextLine();
		// System.out.println("Site: ");
		// String site=kb.nextLine();
		// System.out.println("Year: ");
		// String year=kb.nextLine();
		// System.out.println("Subject: ");
		// String sub=kb.nextLine();
		
		// System.out.println("_______________________________________");
		// format(site,year);
		// format(name,sub);
		// System.out.println("_______________________________________");
	// }
	
	// public static void format(String one, String two)
	// {
		// System.out.printf("+ %20s\t%15s +\n",one,two);
	// }

// }
