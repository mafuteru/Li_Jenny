import java.util.Scanner;

public class Lab_04_01
{
	public static void main(String[]args)
	{
		Lab_04_01 form = new Lab_04_01();
		
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		String subtot = "Subtotal:";
		double subtotNum = price1+price2+price3;
		String tax = "Tax:";
		double taxNum = subtotNum*1.075;
		String tot = "Total:";
		double totNum = subtotNum+taxNum;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		
		form.format(item1,price1);
		form.format(item2,price2);
		form.format(item3,price3);
		
		System.out.println("\n");
		form.format(subtot,subtotNum);
		form.format(tax,taxNum);
		form.format(tot,totNum);
		
		System.out.println("\n__________________________________________");
		System.out.println(" * Thank you for your support *");
		
	}
	 
	public void format(String word, double number)
	{
		System.out.printf("\n* %18s ........ %8.2f",word,number);
	}	
	 
}