import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		System.out.println(name+"??!!! Why would anyone name a baby that? \nHow old are you, "+name+"?");
		
		int age = keyboard.nextInt();
		System.out.println("A "+age+"-year-old is but a young grasshopper. \nWhat do you do for fun, "+name+"?");
		
		keyboard.nextLine();
		String hobby = keyboard.nextLine();
		System.out.println("I thought only savages like to "+hobby+".\nWhat kind of music do you like?");
		
		String music = keyboard.nextLine();
		System.out.println(music+" makes my ears bleed. \nHow many siblings do you have?");
		
		int sibling = keyboard.nextInt();
		System.out.println(sibling+" siblings is "+sibling+" too many. \nWhat do you want to be when you grow up?");

		keyboard.nextLine();
		String future = keyboard.nextLine();
		System.out.println("I think you'd have to be smarter to be a "+future+".\n");
		System.out.println("So "+name+", you're "+age+"... \nYou like to "+hobby+" and listen to "+music+"...");
		System.out.println("Good luck becoming a "+future+". \nI'm only kiddin' "+name+".");
	}
}