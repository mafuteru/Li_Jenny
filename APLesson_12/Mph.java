import static java.lang.Math.*;
public class Mph
{
	private int distance, hours, minutes;
	private double mph;
	
	public Mph()
	{
		distance=0;
		hours=0;
		minutes=0;
		mph=0;
	}
	
	public Mph(int dist, int hrs, int min)
	{
		distance=dist;
		hours=hrs;
		minutes=min;
		mph=0;
	}
	
	public void setDistance(int dist)
	{
		distance=dist;
	}
	
	public void setHours(int hrs)
	{
		hours=hrs;
	}
	
	public void setMinutes(int min)
	{
		minutes=min;
	}
	
	public double getMph()
	{
		mph=Math.round(distance/(hours+minutes/60.0));
		return mph;
	}
}