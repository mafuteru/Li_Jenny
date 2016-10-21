import java.util.Scanner;
public class Lesson_06
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number of cookies: ");
		int cookies = kb.nextInt();
		int batch = 1;
		for(int needed=cookies; needed>0; needed-=25) //i=i+1, or i+=1, -= is counting down
		{
			System.out.println("Cookies Needed: "+needed);
			System.out.println("Batch #: "+batch);
			batch++;
		}
		System.out.println("Order up!!");
	}
}