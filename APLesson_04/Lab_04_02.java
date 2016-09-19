import java.util.Scanner;

public class Lab_04_02
{
	public static void main(String[]args)
	{
		Lab_04_02 form = new Lab_04_02();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firName = kb.next();
		
		System.out.println("Enter your last name:");
		String lastName = kb.next();
		
		System.out.println("Enter your title:");
		String title = kb.next();
		
		kb.nextLine();
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
	
		System.out.println("*************************************");
		form.format(school,year);
		form.format(firName,lastName);
		form.format(title,subject);
		System.out.println("*************************************");
		
	}
	
	public void format(String word1, String word2)
	{
		System.out.printf("* %13s %18s  *\n",word1,word2);
	}
}