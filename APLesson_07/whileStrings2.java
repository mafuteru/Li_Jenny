import java.util.Scanner;
public class whileStrings2
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		
	
		while(sentence.indexOf(" ")>=0) //check if there is empty space; if false, returns -1
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + sentence.substring(sentence.indexOf(" ")+1);
			//substring of sentence before the space to the substring of sentence after the space
				
		}

		System.out.println("Without spaces... "+ sentence);
		
	}

	
}