public class Lesson_09_Num
{
	public static void main(String[]args)
	{
		int[] numbers=new int[10];
		
		//fill array with 10 different random numbers
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1; //between 1-100
		}
		
		for(int num:numbers)
			System.out.println(num);
		
		System.out.println();
		System.out.println("The sum of the numbers above is... "+sumArray(numbers));
	}
	
	public static int sumArray(int[] n) //pass the integer array as a parameter
	{
		int sum=0;
		for(int num:n)
		{
			sum+=num;
		}
		return sum;
	}
	
}