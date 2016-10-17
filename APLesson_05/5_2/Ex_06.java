import java.util.Scanner;
public class Ex_06
{
	static Scanner kb;
	static String user;
	static String pass;
	public static void main(String[]args)
	{
		kb=new Scanner(System.in);
		user="tom";
		pass="crumpet";
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Username:");
		String enterUser= kb.next();
		System.out.println("Password:");
		String enterPass= kb.next();
		if(enterUser.equals(user)&&enterPass.equals(pass))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(enterUser.equals(user))
				System.out.println("Your password is incorrect!");
			else if(enterPass.equals(pass))
				System.out.println("Your username is incorrect!");
			else
				System.out.println("Your username and password are incorrect!");
			passCheck();
		}
	}
}