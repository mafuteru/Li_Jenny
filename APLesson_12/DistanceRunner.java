import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("X coordinate of first point:");
		int x1=kb.nextInt();
		System.out.println("Y coordinate of first point:");
		int y1=kb.nextInt();
		System.out.println("X coordinate of second point:");
		int x2=kb.nextInt();
		System.out.println("Y coordinate of second point:");
		int y2=kb.nextInt();
		
		Distance object =new Distance(x1,y1,x2,y2);
		System.out.println("Distance: "+object.getDistance());
		
		//new info
		object.setValues(3,0,0,4);
		System.out.println("Distance: "+object.getDistance());
	}
}