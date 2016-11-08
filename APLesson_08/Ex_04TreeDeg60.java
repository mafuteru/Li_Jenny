import java.util.Scanner;
public class Ex_04TreeDeg60
{
	static int stop;
	static int start=0;
	static String word;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		word = kb.next();
		stop = word.length();
		tree();
	}	
	public static void tree()
	{
		if(start<=stop)
		{
			System.out.printf("%20s\n",word.substring(0,start));
			start=1+start;
			tree();
		}
		else
			System.out.println("");
	}
}