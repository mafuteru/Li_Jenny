public class Advance extends Ticket
{	
	private int daysLeft;
	
	public Advance()
	{
		daysLeft=0;
	}
	
	public Advance(int d)
	{
		daysLeft=d;
	}
	
	public int getDL()
	{
		return daysLeft;
	}
	
	public double getPrice()
	{
		if(getDL()>=10)
			return 30.00;
		else
			return 40.00;
	}
}