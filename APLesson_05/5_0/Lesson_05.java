public class Lesson_05
//If statements
//{
	// public static void main(String[]args)
	// {
		
		// if(tOrF())
		// {
			// System.out.println("It is true!");
		// }
		
		// if(!tOrF())
		// {
			// System.out.println("It is false!");
		// }
		
	// }
	
	// public static boolean tOrF()
	// {
		// return 2>=5;
	// }
// }

//Generating Random numbers
{
	public static void main(String[]args)
	{
		int num=(int)(1+Math.random()*100); //1+ shifts everything, making range 1-100, not 0-99
		System.out.println(num);
	}

}