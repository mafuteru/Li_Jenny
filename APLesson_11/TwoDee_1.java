public class TwoDee_1
{
	public static void main(String[]args)
	{
		//filling the array
		int[][]values=new int[4][4];
		values[0][0]=1;
		values[1][1]=2;
		values[2][2]=3;
		values[3][3]=4;
		
		//print out the array using nested for loop
		//outside for loop handles rows
		for(int i=0; i<values.length; i++)
		{
			for(int j=0; j<values[i].length; j++) //values of i is an array; returns that length
			//loops through each value of the array that's in each row
			{
				System.out.print(values[i][j]);
			}
			System.out.println(); //prints extra line after row
		}
	}
}