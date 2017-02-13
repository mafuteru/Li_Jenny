public class TicketDriver
{
	public static void main (String[]args)
	{
		WalkUp object = new WalkUp();
		System.out.println(object);

		Advance object2 = new Advance(17);
		System.out.println(object2);
		
		StudentAdvance object3 = new StudentAdvance(14);
		System.out.println(object3);
	}
}