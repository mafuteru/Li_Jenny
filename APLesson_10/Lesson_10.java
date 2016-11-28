import java.util.ArrayList;
import java.util.Arrays;
public class Lesson_10
{
	public static void main(String[]args)
	{
		Integer [] numbers={1, 2, 3, 4, 5};
		ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(numbers)); 
		//takes numbers and turns into ArrayList
		
		System.out.println(nums);
	}	
}