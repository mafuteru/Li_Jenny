import java.util.Scanner;
public class whileStrings1
{
	static String sentence;
	static int top = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		
	
		while(top<sentence.length())
		{
			System.out.println(sentence.charAt(top)); //prints each character on new line
			top++;
		}
		
	}

	
}