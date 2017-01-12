import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter your hair color: ");
		String hair=kb.nextLine();
		System.out.println("Enter eye color:");
		String eyes=kb.nextLine();
		System.out.println("Enter skin color:");
		String skin=kb.nextLine();
		
		Human object=new Human(hair,eyes,skin);
		
		System.out.println("My info...\nHair: "+object.getHair());
		System.out.println("Eyes: "+object.getEyes());
		System.out.println("Skin: "+object.getSkin());
		
		object.setHES("red","yellow","tan");
		System.out.println("\nFriend's info...\nHair: "+object.getHair());
		System.out.println("Eyes: "+object.getEyes());
		System.out.println("Skin: "+object.getSkin());
	}
}