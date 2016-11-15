import java.util.Scanner;
public class Lesson_09
{
	public static void main(String[]args)
	{
		String[] names = new String[5];
		Scanner kb=new Scanner(System.in);
		System.out.println("Please enter 5 names: ");
		
		//fills the array
		for(int i=0; i<names.length; i++) //names.length=5, length is a property
		{
			names[i]=kb.next(); //set the value of names at position i to kb.next
		}
		
		//print the array: enhanced for loop
		for(String name:names) //for each item(called name) in names
		{
			System.out.print("\""+name.length()+"\" "); 
			//name.length() parenthesis needed for String length since it's a method
		}
	}
}