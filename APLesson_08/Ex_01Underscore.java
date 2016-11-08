import java.util.Scanner;
public class Ex_01Underscore
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		System.out.println(replace(kb.nextLine()));
	}
	
	public static String replace(String sentence)
	{
		if(!(sentence.indexOf(" ")>=0))
			return sentence;
		else
			return replace(sentence.substring(0,sentence.indexOf(" "))+"_"+sentence.substring(sentence.indexOf(" ")+1));
		
	}
	
}