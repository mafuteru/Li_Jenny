public class TwoDee_Fill
{
	public static void main(String[]args)
	{
		int[][]values=new int[4][4];
		
		//filling the array
		// int num=1;
		// for(int i=0; i<values.length; i++)
		// {
			// for(int j=0; j<values[i].length; j++)
			// {
				// values[i][j]=num;
				// num++;
			// }
		// }
		
		//by column: now inside loop controls row
		int num=1;
		for(int i=0; i<values.length; i++)
		{
			for(int j=0; j<values[i].length; j++) 
			{
				values[j][i]=num;
				num++;
			}
		}
		
		//print out the array using nested for loop
		for(int i=0; i<values.length; i++)
		{
			for(int j=0; j<values[i].length; j++) //values of i is an array; returns that length
			{
				System.out.print(values[i][j]+"\t");
			}
			System.out.println(); //prints extra line after row
		}
		
		//search the array
		int count=0;
		for(int i=0; i<values.length; i++)
		{
			for(int j=0; j<values.length; j++)
			{
				if(values[i][j]%5==0)
				{
					count++;
				}
			}
		}
		System.out.println("There are "+count+" multiples of 5 in the Array.");
	}
}