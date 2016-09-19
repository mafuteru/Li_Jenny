public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		System.out.printf("%10s  %10.2f","test",647654654.5454); 
		//10 is spaces available
		//.2 indiciates number of decimal places printed
		System.out.printf("\n%10s  %10.2f","thisexam",998978.03); 
		
		String word1 = "blaaah";
		double number1 = 654654.543;
		
		form.format(word1,number1);
		
		String word2 = "yesssssss";
		double number2 = 465465.22;
		form.format(word2,number2);
		
		
	}
	 
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f",word,number);
	}	
	 
}