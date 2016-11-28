import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Ex_02_Expression_Solver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation(using spaces between operators): ");
		String expression = kb.nextLine();
		
		ArrayList<String> equation= new ArrayList<>(Arrays.asList(expression.split(" ")));
		//Arrays.asList converts the Array (created from the split) into ArrayList
		
		doEquation(equation);
	}	
	
	public static void doEquation(ArrayList<String> equation)
	{
		//turn string into integers, then turn back to string again
		int i=0;
		
		while(i<equation.size()) //inside a ArrayList now
		{
			if(equation.get(i).equals("+")||equation.get(i).equals("-"))
			{
				if(i<equation.size() && equation.get(i).equals("+"))
				{
				//find the +, add the part before (i-1) to the part after (i+1)
				//6 + 3, get 6 and 3
				//Integer.parseInt converts both to integers?
				//adding "" automatically turns it back into a string
				//sets the value of i equal to all of that stuff
					equation.set(i, ""+ (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				
				// 6 + 5
				// turns into 11 5
				// remove the 5 (i), 11 is i-1
				}
				else
				{
					equation.set(i, ""+ (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
				
			else if(equation.get(i).equals("*")||equation.get(i).equals("/"))
			{
				if(i<equation.size() && equation.get(i).equals("*"))
				{
					equation.set(i, ""+ (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, ""+ (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
		
		System.out.println(equation);
	}
}