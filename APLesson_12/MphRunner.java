import java.util.Scanner;
public class MphRunner
{
	public static void main (String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter distance:");
		int distance=kb.nextInt();
		System.out.println("Enter hours:");
		int hours=kb.nextInt();
		System.out.println("Enter minutes:");
		int minutes=kb.nextInt();
		
		Mph object =new Mph(distance,hours,minutes);
		System.out.println(distance+" miles in "+hours+" hours = "+object.getMph()+" mph");
		
		//new info
		object.setDistance(10);
		object.setHours(2);
		object.setMinutes(20);
		System.out.println(distance+" miles in "+hours+" hours = "+object.getMph()+" mph");
	}
}