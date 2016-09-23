public class RetMethods
{
	public static void main(String[]args)
	{
		RetMethods average = new RetMethods(); //average is an object
		int n1=3;
		int n2=8;
		int n3=15;
		double avg = average.calcAvg(n1,n2,n3); //n1 goes into "one" variable, n2 goes to two, etc.
		System.out.printf("The volume of your cube is %10.2f\n",avg); 
	}
	
	public double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0; //use 3.0, lets output be decimal
	}
}