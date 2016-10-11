import java.util.Random;
public class Lesson_05_Random
{
	public static void main(String[]args)
	{
		Random rand=new Random();
		int num=rand.nextInt(3)+1; //range is 1-3
		System.out.println(num);
	}
}