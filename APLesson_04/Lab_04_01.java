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
		
		double subtot = price1+price2+price3;
		double tax = subtot*1.075;
		double tot = subtot+tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		
		form.format(item1,price1);
		form.format(item2,price2);
		form.format(item3,price3);
		
		System.out.println("\n");
		form.format("Subtotal: ",subtot);
		form.format("Tax: ",tax);
		form.format("Total: ",tot);
		
		System.out.println("\n__________________________________________");
		System.out.println(" * Thank you for your support *");
		
	}
	 
	public void format(String item, double price)
	{
		System.out.printf("\n* %18s ........ %8.2f",item,price);
	}	
	 
}