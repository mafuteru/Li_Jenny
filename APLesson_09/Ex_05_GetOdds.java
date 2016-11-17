public class Ex_05_GetOdds
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers=new int[10];
		fillArray();
		System.out.println("For the following numbers... ");
		printArray();
		System.out.println("\nThe "+getOdds()+"are odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	
	public static void printArray()
	{
		for(int num:numbers)
			System.out.print(num+" ");
	}
	
	public static String getOdds()
	{
		String odds="";
		for(int num:numbers)
		{
			if((num%2)!=0)
				odds+=num+" ";
		}
		return odds;
	}
	
}