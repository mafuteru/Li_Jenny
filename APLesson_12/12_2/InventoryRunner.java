import java.util.Scanner;
public class InventoryRunner
{
	public static void main (String[]args)
	{
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Enter item manufacturer:");
		String manufacturer=kb.next();
		System.out.println("Enter item name:");
		String name=kb.next();
		
		System.out.println("Would you like to enter category and price information? (y or n)");
		if(kb.next().equals("n"))
		{
			Inventory object = new Inventory(manufacturer,name);
			System.out.println(object);
		}
		else
		{
			System.out.println("Enter category:");
			String category=kb.next();
			System.out.println("Enter price:");
			int price=kb.nextInt();
			
			Inventory object2 = new Inventory(manufacturer,name,category,price);
			object2.setCat(category);
			object2.setPrice(price);
			
			System.out.println(object2);
		}
	}
	
}