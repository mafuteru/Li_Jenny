import java.util.Scanner;
public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Count up to: ");
		int top= kb.nextInt();
		System.out.println("Count by: ");
		int countBy= kb.nextInt();
		for(int i=countBy; i<=top; i+=countBy)
		{
			System.out.print(i+"\t");
		}
	}
}