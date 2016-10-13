import java.util.Scanner;
public class Equals
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String word1= kb.next();
		String word2= kb.next();
		//not declaring a primitive datatype; you're declaring an object with String
		
		if(word1.equals(word2))
			System.out.println("The words are equal!"); 
		//== checks if both values refer to the same object, not checking equality in value
		
		else
			System.out.println("The words are not equal!");
	}
}