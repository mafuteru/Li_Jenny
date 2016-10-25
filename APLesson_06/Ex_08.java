public class Ex_08
{
	public static void main(String[]args)
	{
		
		sing("Na",4);
		sing("Na",4);
		sing("Hey",3);
		sing("Goodbye!",1);
	}
	
	public static void sing(String word, int n)
	{
		for(int i=1; i<=n; i++)
		{
			System.out.print(word+" ");
		}
		System.out.println("\n");
	}
}