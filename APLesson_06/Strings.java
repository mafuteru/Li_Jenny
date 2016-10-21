public class Strings
{
	public static void main(String[]args)
	{
		String word = "COMPSCI"; //numbered from 0-6
		System.out.println(word.length());
		System.out.println(word.indexOf("OMPS"));
		
		System.out.println(word.substring(1,4)); //top of the range is exclusive
		System.out.println(word.substring(2)); //2 to the end
		
		System.out.println(word.charAt(2)); //return the character at the index
	}
}