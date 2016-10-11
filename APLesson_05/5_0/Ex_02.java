import java.util.Scanner;
public class Ex_02
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first item: ");
		String item1 = kb.next();
		System.out.println("Enter first item's price: ");
		double price1 = kb.nextDouble();
		System.out.println("Enter second item: ");
		String item2 = kb.next();
		System.out.println("Enter second item's price: ");
		double price2 = kb.nextDouble();
		System.out.println("Enter third item: ");
		String item3 = kb.next();
		System.out.println("Enter third item's price: ");
		double price3 = kb.nextDouble();
		System.out.println("Enter fourth item: ");
		String item4 = kb.next();
		System.out.println("Enter fourth item's price: ");
		double price4 = kb.nextDouble();
		
		double subtot= price1+price2+price3+price4;
		double discount= calcDisc(subtot);
		double tax= subtot*.08;
		double total= subtot-discount+tax;
		
		System.out.println("<<<<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>>>\n");
		format(item1,price1);
		format(item2,price2);
		format(item3,price3);
		format(item4,price4);
		format("Subtotal",subtot);
		format("Discount",discount);
		format("Tax",tax);
		format("Total",total);
		System.out.println("_________________________________________");
		System.out.println("******** Thank you for shopping! ********");
	}
	
	public static double calcDisc(double subtot)
	{
		if(subtot>=2000)
			return subtot*.15;
		return 0.0; //if none of the previous if doesn't work
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%14s ........  %4.2f\n",item,price);
	}
	
}