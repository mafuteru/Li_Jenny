import java.util.Scanner;
public class Ex_04ReplaceAts
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence=kb.nextLine();
		
		replace();
		System.out.println(sentence);
	}
	
	public static void replace()
	{
		while(sentence.indexOf("a")>=0)
		{
			sentence = sentence.substring(0,sentence.indexOf("a"))+"@"+sentence.substring(sentence.indexOf("a")+1);
		}
	}
}