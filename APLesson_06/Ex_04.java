import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num= kb.nextInt();
		System.out.println("Rows of the table: ");
		int size= kb.nextInt();
		System.out.printf("%3s %10s"+num+"\n","n","n*");
		
		for(int i=1; i<=size; i++)
		{
			System.out.printf("%3d %10d\n",i,i*num);
		}
	}
}