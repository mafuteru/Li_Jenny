import java.util.Scanner;
public class UserRunner
{
	public static void main (String[]args)
	{
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String firstName=kb.next();
		System.out.println("Enter last name:");
		String lastName=kb.next();
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		if(kb.next().equals("n"))
		{
			User pH = new User(firstName,lastName);
			System.out.println(pH);
		}
		else
		{
			System.out.println("Enter avatar:");
			String avatar=kb.next();
			User pH2 = new User(firstName,lastName,avatar);
			pH2.setAvatar(avatar);
			System.out.println(pH2);
		}
	}
	
}