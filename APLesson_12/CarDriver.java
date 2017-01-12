import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter paint color: ");
		String paint=kb.nextLine();
		System.out.println("Enter interior type:");
		String interior=kb.nextLine();
		System.out.println("Enter engine type:");
		String engine=kb.nextLine();
		System.out.println("Enter tires:");
		String tires=kb.nextLine();
		
		Car object=new Car(paint,interior,engine,tires);
		System.out.println("Paint: \t"+object.getPaint());
		System.out.println("Interior: \t"+object.getInterior());
		System.out.println("Engine: \t"+object.getEngine());
		System.out.println("Tires: \t"+object.getTires());
	}
}