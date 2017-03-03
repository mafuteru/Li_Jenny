import java.util.ArrayList;
public class Toyota implements Location
{
	private double[] location;
	
	public Toyota()
	{
		location= new double[2];
	}
	
	public Toyota(String c)
	{
		location = new double[2];
		String[] cList = c.split(", ");
		location[0]=Double.parseDouble(cList[0]);
		location[1]=Double.parseDouble(cList[1]);
	}
	
	public int getID()
	{
		return (int)(Math.random()*999999)+100000;
	}
	
	public void move(double x, double y)
	{
		location[0]+= x;
		location[1]+= y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}